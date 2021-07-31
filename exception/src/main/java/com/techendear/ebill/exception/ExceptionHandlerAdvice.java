package com.techendear.ebill.exception;

import java.time.LocalDateTime;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.techendear.ebill.exception.constant.ErrorMessage;
import com.techendear.ebill.exception.constant.ExceptionCode;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ExceptionHandlerAdvice {

	/*
	 * Resource Moved Error 300 codes
	 */
	@ExceptionHandler(value = ResourceMovedException.class)
	public ResponseEntity<Errordto> resourceMoved(ResourceMovedException ex) {
		Errordto error = new Errordto();
		error.setErrorCode(ExceptionCode.RESOURCE_MOVED_PERMANENTLY.getErrorCode());
		error.setErrorGroup(ExceptionCode.RESOURCE_MOVED_PERMANENTLY.getErrorGroup().toString());
		error.setErrorMessage(ErrorMessage.RESOURCE_MOVED_PERMANENTLY.getErrorMessage() + ": " + ex.getMessage());
		error.setTimeStamp(LocalDateTime.now());
		return new ResponseEntity<Errordto>(error, HttpStatus.MOVED_PERMANENTLY);
	}

	/*
	 * Resource Errors 400 codes
	 */
	
}
