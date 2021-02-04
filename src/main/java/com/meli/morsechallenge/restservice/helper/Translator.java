package com.meli.morsechallenge.restservice.helper;

import org.springframework.stereotype.Service;
import com.meli.morsechallenge.restservice.domain.MessageBody;

@Service
public class Translator {
	
	public String translate (String message) {
		
		return message;
	}
	
	public MessageBody stringToMorse (String message) {
		MessageBody messageBody = new MessageBody(message);
		return messageBody;
	}
	
	public MessageBody morseToString (String message) {
		MessageBody messageBody = new MessageBody(message);
		return messageBody;
	}

}
