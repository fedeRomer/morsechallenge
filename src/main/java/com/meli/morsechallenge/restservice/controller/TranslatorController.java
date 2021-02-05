package com.meli.morsechallenge.restservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.morsechallenge.restservice.domain.MessageBody;
import com.meli.morsechallenge.restservice.helper.Translator;
import com.meli.morsechallenge.restservice.response.TranslatorResponse;

/*
 * curl -d '{"text":"mensajetest"}' -H "Content-Type: application/json" -X POST http://localhost:8080/translate/2text
 */
@RestController
@RequestMapping(value = "/translate")
public class TranslatorController {


	@Autowired
	Translator translatorService;

	@PostMapping(value = "/2text", consumes = "application/json", produces = "application/json")
	public ResponseEntity<TranslatorResponse> textToMorse(@RequestBody MessageBody messageBody) {
		
		TranslatorResponse translatorResponse = translatorService.stringToMorse(messageBody);
		
		return new ResponseEntity<TranslatorResponse>(translatorResponse, translatorResponse.getHttpStatus());
	}

	@PostMapping(value = "/2morse", consumes = "application/json", produces = "application/json")
	public ResponseEntity<TranslatorResponse> morseToText(@RequestBody MessageBody messageBody) {
		
		TranslatorResponse translatorResponse = translatorService.translate2Human(messageBody);
		
		return new ResponseEntity<TranslatorResponse>(translatorResponse,translatorResponse.getHttpStatus());
	}

}
