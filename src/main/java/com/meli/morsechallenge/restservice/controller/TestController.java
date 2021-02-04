package com.meli.morsechallenge.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meli.morsechallenge.restservice.domain.MessageBody;
import com.meli.morsechallenge.restservice.domain.Test;
import com.meli.morsechallenge.restservice.helper.Translator;

/*
 * curl -d '{"text":"mensajetest"}' -H "Content-Type: application/json" -X POST http://localhost:8080/translate/2text
 */
@RestController
@RequestMapping(value = "/translate")
public class TestController {
	
	private static final String test ="Hola mundo";
	
	@Autowired Translator translatorService;
	
	@GetMapping("/test")
	public Test test (@RequestParam(value = "input",defaultValue="test")String input) {
		return new Test(0, test);
	}
	
	@PostMapping(value="/2text", consumes = "application/json", produces = "application/json")
	public MessageBody textToMorse (@RequestBody MessageBody messageBody) {
		
		//logica de texto a morse
		
		return translatorService.stringToMorse(messageBody.getText());
	}
	
	@PostMapping(value="/2morse", consumes = "application/json", produces = "application/json")
	public MessageBody morseToText (@RequestBody MessageBody messageBody) {
		
		//logica de morse a texto
		
		return translatorService.morseToString(messageBody.getText());
	}
	

}
