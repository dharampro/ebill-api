package com.techendear.ebill.exception;

public class InvalidRequestException extends RuntimeException {

	/**
	 * Custom Serial version id
	 */
	private static final long serialVersionUID = -7913736454892956201L;

	public InvalidRequestException(String msg) {
		super(msg);
	}
}
