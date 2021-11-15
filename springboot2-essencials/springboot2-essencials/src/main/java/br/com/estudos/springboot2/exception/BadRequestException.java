package br.com.estudos.springboot2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = -8493734016103966938L;

	public BadRequestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
