package com.json.parsing;

import java.util.ArrayList;
import java.util.List;

public class GainLossReport {

	public List<ReportItem>reportItems=new ArrayList<>();
	
	public List<ReportItem> getReportItems() {
		return reportItems;
	}
	
	public void addItems(ReportItem toAdd) {
		reportItems.add(toAdd);
		
	}

}