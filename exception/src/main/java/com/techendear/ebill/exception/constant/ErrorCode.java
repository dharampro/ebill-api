package com.techendear.ebill.exception.constant;

public class ErrorCode {

	/*
	 * Resource Moved Error 300 codes
	*/
	public static final String RESOURCE_MOVED_PERMANENTLY = "E0301";
	
	/*
	 * Resource Errors 400 codes
	*/	
	public static final String INVALID_REQUEST = "E0400";
	public static final String UNAUTHORIZED_REQUEST = "E0401";
	public static final String PAYMENT_REQUIRED = "E0402";
	public static final String FORBIDDEN_REQUEST = "E403";
	public static final String RESOURCE_NOT_FOUND = "E0404";
	public static final String METHOD_NOT_ALLOWED = "E0405";
	public static final String REQUEST_TIMEOUT = "E0408";
	public static final String CONFLICT = "E0409";

	/*
	 * Server Errors 500 codes
	*/	
	public static final String SERVER_ERROR = "E0500";	
	
	/*
	 * Unknown Error
	*/	
	public static final String UNKNOWN_ERROR = "E0000";
}
