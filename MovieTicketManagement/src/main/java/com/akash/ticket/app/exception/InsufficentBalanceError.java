package com.akash.ticket.app.exception;

public class InsufficentBalanceError extends RuntimeException {

	public InsufficentBalanceError(String message) {
		super(message);
	}
}
