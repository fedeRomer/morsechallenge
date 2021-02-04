package com.meli.morsechallenge.restservice.domain;

public class MessageBody {

	private String text;

	public MessageBody(String text) {
		super();
		this.text = text;
	}
	
	public MessageBody() {}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
