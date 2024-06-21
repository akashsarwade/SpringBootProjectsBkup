package com.json.parsing;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MonthlyStockList {

	private final List<StockData> stockData = new ArrayList<>();

	public void addStockData(StockData toAdd) {
		stockData.add(toAdd);

	}

	public List<StockData> getStockData() {
		return stockData;
	}

	public StockData findByDate(LocalDate date) {
		var endOfMonth = date.withDayOfMonth(date.getMonth().length(date.isLeapYear()));
		return stockData.stream().filter(data -> data.getDate().isEqual(endOfMonth)).findFirst().orElse(null);
	}

	public int size() {
		return stockData.size();
	}

	public BigDecimal getAverage() {
        var sum = BigDecimal.ZERO;

        for (var item : stockData) {
            sum = sum.add(item.getValue());
        }

        var count = BigDecimal.valueOf(size());
        return sum.divide(count, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getGainLossPercentage(BigDecimal originalPurchasePrice) {
//        Net Gain or Net Loss = (Current Price - Original Purchase Price) ÷ Original Purchase Price x 100
        var firstStockData = stockData.stream().findFirst();
        if(firstStockData.isPresent()) {
            var data = firstStockData.get();
            var currentPrice = data.getValue();
            return currentPrice.subtract(originalPurchasePrice)
                    .divide(originalPurchasePrice, RoundingMode.HALF_EVEN)
                    .multiply(BigDecimal.valueOf(100));
        }

        return BigDecimal.ZERO;
    }
}
