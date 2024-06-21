package com.akash.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.ticket.app.dto.MovieTicketAcknowledgment;
import com.akash.ticket.app.dto.MovieTicketRequest;
import com.akash.ticket.app.service.MovieTicketService;

@RestController
public class MovieTicketController {

	@Autowired
	MovieTicketService movieTicketService;
	
	@PostMapping("/BookTicket")
	public MovieTicketAcknowledgment bookTicket(@RequestBody MovieTicketRequest request) {

		return movieTicketService.bookMovie(request);
	}
}
