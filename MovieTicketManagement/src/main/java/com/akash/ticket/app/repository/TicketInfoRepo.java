package com.akash.ticket.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.ticket.app.entity.TicketInfo;

public interface TicketInfoRepo extends JpaRepository<TicketInfo, String> {

}
