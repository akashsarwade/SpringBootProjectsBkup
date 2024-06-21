package com.json.parsing;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Main {

    private static final String STOCKS_URL = "http://localhost:8081/monthly?symbol=%s";
    private static ObjectMapper objectMapper;

    public static void main(String[] args) throws Exception {
        createObjectMapper();
        var purchaseList = getPurchaseList();

        for (var item : purchaseList.getItems()) {
            System.out.println("item= " + item);
        }

        var report = createReport(purchaseList);
        saveReport(report);

        for (var reportItem : report.getReportItems()) {
            System.out.println("item= " + reportItem);
        }
    }

    private static void createObjectMapper() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    public static MonthlyStockList getMonthlyStockList(String symbol) throws Exception {
        var stocksUrl = String.format(STOCKS_URL, symbol);
        var apiUrl = new URL(stocksUrl);
        var jsonNode = objectMapper.readTree(apiUrl);
        System.out.println("jsonNode= " + jsonNode.textValue());
        var monthly = jsonNode.get("Monthly Time Series");
        var elements = monthly.fields();
        var monthlyStockList = new MonthlyStockList();

        while (elements.hasNext()) {
            var next = elements.next();
            var date = LocalDate.parse(next.getKey(), DateTimeFormatter.ISO_DATE);
            var value = next.getValue().get("4. close").textValue();
            var actual = new BigDecimal(value);
            System.out.println("date= " + date + " actual= " + actual + " value= " + value);
            var stockData = new StockData(date, actual);
            monthlyStockList.addStockData(stockData);
        }

        return monthlyStockList;
    }


    private static PurchaseList getPurchaseList() throws Exception {
        var file = getFileFromResource("purchases.json");
        var jsonString = Files.readString(file.toPath());
        var items = objectMapper.readValue(jsonString, new TypeReference<List<PurchaseItem>>() { });
        return new PurchaseList(items);
    }

    private static File getFileFromResource(String fileName) throws Exception{
        ClassLoader classLoader = Main.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }

    public static GainLossReport createReport(PurchaseList purchaseList) throws Exception {
        var report = new GainLossReport();

        for (var purchaseItem : purchaseList.getItems()) {
            System.out.println("symbol= " + purchaseItem.getSymbol());
            var monthly = getMonthlyStockList(purchaseItem.getSymbol());
            var average = monthly.getAverage();
            var percentage = monthly.getGainLossPercentage(purchaseItem.getPurchasePrice());

            var reportItem = new ReportItem();
            reportItem.setSymbol(purchaseItem.getSymbol());
            reportItem.setAverage(average);
            reportItem.setPercent(percentage);

            report.addItems(reportItem);
        }

        return report;
    }

    public static void saveReport(GainLossReport report) throws Exception {
        objectMapper.writeValue(new File("report.json"), report);
    }


}
