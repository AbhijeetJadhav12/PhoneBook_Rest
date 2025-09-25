package org.techhub.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.techhub.binding.ErrorInfo;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		
		ErrorInfo er=new ErrorInfo();
		er.setMsg(e.getMessage());
		er.setTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(er,HttpStatus.REQUEST_TIMEOUT);
		
	}
	
}
