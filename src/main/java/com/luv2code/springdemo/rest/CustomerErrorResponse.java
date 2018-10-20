package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {

	private int status;
	private String message;
	private String date;
	private StackTraceElement[] stackTrace;
	
	public CustomerErrorResponse() {}

	public CustomerErrorResponse(int status, String message, String date, StackTraceElement[] stackTrace) {
		this.status = status;
		this.message = message;
		this.date = date;
		this.stackTrace = stackTrace;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public StackTraceElement[] getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(StackTraceElement[] stackTrace) {
		this.stackTrace = stackTrace;
	}	
}
