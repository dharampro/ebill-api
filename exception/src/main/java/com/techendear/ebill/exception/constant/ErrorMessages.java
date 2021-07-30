package com.techendear.ebill.exception.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ErrorMessages {

	/*
	 * Customer Management Exceptions
	 */
	INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "Ohh!! It's a glitch we are working on it"),
	BAD_REQUEST("BAD_REQUEST", "Something is wrong in data"),
	PRECONDITION_FAILED("PRECONDITION_FAILED", "Request dosen't match"),
	CONFLICT("CONFLICT", "There is a conflict"),
	UNAUTHORIZED("UNAUTHORIZED", "Unauthorized request"),
	FORBIDDEN("FORBIDDEN","Insufficient rights to access");

	private String messageType;
	private String messageKey;
}
