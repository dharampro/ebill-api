package com.techendear.ebill.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Errordto {

	private String errorGroup;
	private String errorCode;
	private String errorMessage;
	private LocalDateTime timeStamp;
}
