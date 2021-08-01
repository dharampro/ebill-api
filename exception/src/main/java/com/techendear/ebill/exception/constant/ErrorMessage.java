package com.techendear.ebill.exception.constant;

import com.techendear.ebill.exception.props.ErrorProps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ErrorMessage {

	/*
	 * Resource Moved Error 300 codes
	 */
	RESOURCE_MOVED_PERMANENTLY(ErrorProps.getMessage("redirect.error.RESOURCE_MOVED_PERMANENTLY")),

	/*
	 * Resource Errors 400 codes
	 */
	INVALID_REQUEST(ErrorProps.getMessage("client.error.INVALID_REQUEST")),
	UNAUTHORIZED_REQUEST(ErrorProps.getMessage("client.error.UNAUTHORIZED_REQUEST")),
	PAYMENT_REQUIRED(ErrorProps.getMessage("client.error.PAYMENT_REQUIRED")),
	FORBIDDEN_REQUEST(ErrorProps.getMessage("client.error.FORBIDDEN_REQUEST")),
	RESOURCE_NOT_FOUND(ErrorProps.getMessage("client.error.RESOURCE_NOT_FOUND")),
	METHOD_NOT_ALLOWED(ErrorProps.getMessage("client.error.METHOD_NOT_ALLOWED")),
	REQUEST_TIMEOUT(ErrorProps.getMessage("client.error.REQUEST_TIMEOUT")),
	CONFLICT(ErrorProps.getMessage("client.error.CONFLICT")),

	/*
	 * Server Errors 500 codes
	 */
	SERVER_ERROR(ErrorProps.getMessage("server.error.SERVER_ERROR")),

	/*
	 * Unknown Error
	 */
	UNKNOWN_ERRORS(ErrorProps.getMessage("unknown.error.UNKNOWN_ERROR"));

	private String errorMessage;
}
