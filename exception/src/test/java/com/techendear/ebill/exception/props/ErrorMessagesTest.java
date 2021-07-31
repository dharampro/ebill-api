package com.techendear.ebill.exception.props;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErrorMessagesTest {

	@Test
	void getMessageTest() {
		assertNotNull(ErrorProps.getMessage("client.error.INVALID_REQUEST"));
		assertEquals(ErrorProps.getMessage("client.error.INVALID_REQUEST"), "Invalid Request");
	}

}
