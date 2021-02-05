package com.meli.morsechallenge.restservice.response;

import org.springframework.http.HttpStatus;

public class TranslatorResponse {

	private String text;
	private Integer code;
	private HttpStatus httpStatus;

	public TranslatorResponse(String text, Integer code, HttpStatus httpStatus) {
		super();
		this.text = text;
		this.code = code;
		this.httpStatus = httpStatus;
	}

	public TranslatorResponse() {}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	

}
