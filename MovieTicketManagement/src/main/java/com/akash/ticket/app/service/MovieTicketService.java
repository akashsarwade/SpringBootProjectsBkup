package com.akash.ticket.app.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.ticket.app.dto.MovieTicketAcknowledgment;
import com.akash.ticket.app.dto.MovieTicketRequest;
import com.akash.ticket.app.entity.PaymentInfo;
import com.akash.ticket.app.entity.TicketInfo;
import com.akash.ticket.app.repository.PaymentInfoRepo;
import com.akash.ticket.app.repository.TicketInfoRepo;
import com.akash.ticket.app.utility.ValidatePaymentInfo;

@Service
public class MovieTicketService {

	@Autowired
	TicketInfoRepo ticketInfoRepo;

	@Autowired
	PaymentInfoRepo paymentInfoRepo;

	public MovieTicketAcknowledgment bookMovie(MovieTicketRequest request) {
		TicketInfo ticketInfo = request.getTicketInfo();
		ticketInfo = ticketInfoRepo.save(ticketInfo);
		PaymentInfo paymentInfo = request.getPaymentInfo();
		ValidatePaymentInfo.validateCreditLimit(paymentInfo.getAccountNo(), ticketInfo.getTicketPrice());

		paymentInfo.setTicketId(ticketInfo.getId());
		paymentInfo.setAmount(ticketInfo.getTicketPrice());
		paymentInfoRepo.save(paymentInfo);

		return new MovieTicketAcknowledgment("Success", ticketInfo.getTicketPrice(),
				UUID.randomUUID().toString().split("-")[0], ticketInfo);

	}
}
