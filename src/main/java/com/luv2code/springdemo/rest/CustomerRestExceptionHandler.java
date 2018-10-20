package com.luv2code.springdemo.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	// add exception handling code here
	// Add an exception handler using @ExceptionHandler
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc){
		
		// create a CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse();
		
		String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date(System.currentTimeMillis()));
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setDate(date);
		error.setStackTrace(exc.getStackTrace());
				
		// return responseEntity
				
		return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	
	// Add another exception handler ... to catch any exception (catch all)
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception exc){

		// create a CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse();
		
		String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date(System.currentTimeMillis()));
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setDate(date);
		error.setStackTrace(exc.getStackTrace());
				
		// return responseEntity				
		return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}			
}
