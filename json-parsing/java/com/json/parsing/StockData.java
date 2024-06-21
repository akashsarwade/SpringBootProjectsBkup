package com.json.parsing;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StockData {

	private final BigDecimal value;
	private final LocalDate date;

	public StockData(LocalDate date, BigDecimal value) {
		super();
		this.value = value;
		this.date = date;
	}

	public BigDecimal getValue() {
		return value;
	}

	public LocalDate getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "StockData [value=" + value + ", date=" + date + "]";
	}

}
