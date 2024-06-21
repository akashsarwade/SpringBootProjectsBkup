package com.json.parsing;

import java.math.BigDecimal;

public class ReportItem {

	 private String symbol;
	    private BigDecimal average;
	    private BigDecimal percent;
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public BigDecimal getAverage() {
			return average;
		}
		public void setAverage(BigDecimal average) {
			this.average = average;
		}
		public BigDecimal getPercent() {
			return percent;
		}
		public void setPercent(BigDecimal percent) {
			this.percent = percent;
		}
		@Override
		public String toString() {
			return "ReportItem [symbol=" + symbol + ", average=" + average + ", percent=" + percent + "]";
		}

		
}
