package com.akash.ticket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MovieTicketManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketManagementApplication.class, args);
	}

}
