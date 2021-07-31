package com.techendear.ebill.exception.props;

import java.io.InputStream;
import java.util.Properties;

public class ErrorProps {

	private static ErrorProps getInstance() {
		return new ErrorProps();
	}

	private String getProp(String key) {
		
		Properties prop = new Properties();
		
		try {
			InputStream in = getClass().getClassLoader().getResourceAsStream("messages.properties");
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	public static String getMessage(String key) {
		ErrorProps prop = ErrorProps.getInstance();
		return prop.getProp(key);
	}
}
