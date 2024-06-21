package com.akash.ticket.app.dto;

import com.akash.ticket.app.entity.PaymentInfo;
import com.akash.ticket.app.entity.TicketInfo;

public class MovieTicketRequest {

	private TicketInfo ticketInfo;
	private PaymentInfo paymentInfo;

	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	@Override
	public String toString() {
		return "MovieTicketRequest [ticketInfo=" + ticketInfo + ", paymentInfo=" + paymentInfo + "]";
	}

}
