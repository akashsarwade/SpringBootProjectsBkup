package com.akash.ticket.app.dto;

import com.akash.ticket.app.entity.TicketInfo;

public class MovieTicketAcknowledgment {

	private String status;
	private double totalFare;
	private String prnNo;
	private TicketInfo ticketInfo;

	public MovieTicketAcknowledgment(String string, double ticketPrice, String string2, TicketInfo ticketInfo2) {
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getPrnNo() {
		return prnNo;
	}

	public void setPrnNo(String prnNo) {
		this.prnNo = prnNo;
	}

	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	@Override
	public String toString() {
		return "MovieTicketAcknowledgment [status=" + status + ", totalFare=" + totalFare + ", prnNo=" + prnNo
				+ ", ticketInfo=" + ticketInfo + "]";
	}

}
