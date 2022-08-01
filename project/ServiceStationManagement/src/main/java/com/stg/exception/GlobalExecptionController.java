package com.stg.exception;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExecptionController {

	/*
	 * @ExceptionHandler(AuctionAppException.class)
	 * 
	 * @ResponseStatus(value = HttpStatus.BAD_REQUEST)
	 * 
	 * @ResponseBody public GlobalExecption
	 * handleResourceNotFound(AuctionAppException exception, HttpServletRequest
	 * request) {
	 * 
	 * GlobalExecption error = new GlobalExecption();
	 * error.setErrorMessage(exception.getMessage());
	 * error.setRequestedURI(request.getRequestURI());
	 * 
	 * return error; }
	 */
	@ExceptionHandler(NotAuthorisedException.class)
	@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
	@ResponseBody
	public GlobalExecption handleResourceNotFound(NotAuthorisedException exception,
			HttpServletRequest request) {

		GlobalExecption error = new GlobalExecption();
		error.setErrorMessage(exception.getMessage());
		error.setRequestedURI(request.getRequestURI());

		return error;
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@ResponseBody
	public GlobalExecption handleResourceNotFound(ResourceNotFoundException exception,
			HttpServletRequest request) {

		GlobalExecption error = new GlobalExecption();
		error.setErrorMessage(exception.getMessage());
		error.setRequestedURI(request.getRequestURI());

		return error;
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public GlobalExecption handleException(final Exception exception,
			final HttpServletRequest request) {

		GlobalExecption error = new GlobalExecption();
		error.setErrorMessage(exception.getMessage());
		error.setRequestedURI(request.getRequestURI());

		return error;
	}

}
