package com.techendear.ebill.exception.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionCode {

	/*
	 * Resource Moved Error 300 codes
	 */
	RESOURCE_MOVED_PERMANENTLY(ErrorGroup.REDIRECTION_ERROR, ErrorCode.RESOURCE_MOVED_PERMANENTLY,
			ErrorMessage.RESOURCE_MOVED_PERMANENTLY),

	/*
	 * Resource Errors 400 codes
	 */
	INVALID_REQUEST(ErrorGroup.CLIENT_ERROR, ErrorCode.INVALID_REQUEST, ErrorMessage.INVALID_REQUEST),
	UNAUTHORIZED_REQUEST(ErrorGroup.CLIENT_ERROR, ErrorCode.UNAUTHORIZED_REQUEST, ErrorMessage.UNAUTHORIZED_REQUEST),
	PAYMENT_REQUIRED(ErrorGroup.CLIENT_ERROR, ErrorCode.PAYMENT_REQUIRED, ErrorMessage.UNAUTHORIZED_REQUEST),
	FORBIDDEN_REQUEST(ErrorGroup.CLIENT_ERROR, ErrorCode.FORBIDDEN_REQUEST, ErrorMessage.FORBIDDEN_REQUEST),
	RESOURCE_NOT_FOUND(ErrorGroup.CLIENT_ERROR, ErrorCode.RESOURCE_NOT_FOUND, ErrorMessage.REQUEST_TIMEOUT),
	METHOD_NOT_ALLOWED(ErrorGroup.CLIENT_ERROR, ErrorCode.METHOD_NOT_ALLOWED, ErrorMessage.METHOD_NOT_ALLOWED),
	REQUEST_TIMEOUT(ErrorGroup.CLIENT_ERROR, ErrorCode.REQUEST_TIMEOUT, ErrorMessage.REQUEST_TIMEOUT),
	CONFLICT(ErrorGroup.CLIENT_ERROR, ErrorCode.CONFLICT, ErrorMessage.CONFLICT),

	/*
	 * Server Errors 500 codes
	 */
	SERVER_ERROR(ErrorGroup.SERVER_ERROR, ErrorCode.SERVER_ERROR, ErrorMessage.SERVER_ERROR),

	/*
	 * Unknown Error
	 */
	UNKNOWN_ERRORS(ErrorGroup.UNKNOWN_ERROR, ErrorCode.UNKNOWN_ERROR, ErrorMessage.UNKNOWN_ERRORS);

	private ErrorGroup errorGroup;
	private String errorCode;
	private ErrorMessage message;

}
