package com.json.parsing;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PurchaseItem {

	private String symbol;
	private BigDecimal purchasePrice;
	private LocalDate purchaseDate;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "PurchaseItem [symbol=" + symbol + ", purchasePrice=" + purchasePrice + ", purchaseDate=" + purchaseDate
				+ "]";
	}

}
