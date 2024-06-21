package com.akash.ticket.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.ticket.app.entity.PaymentInfo;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, Long> {

}
