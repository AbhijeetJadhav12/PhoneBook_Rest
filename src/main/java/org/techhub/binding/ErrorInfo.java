package org.techhub.binding;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {

	private String msg;
	private LocalDateTime time;
}
