package com.meli.morsechallenge.restservice.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.morsechallenge.restservice.domain.MessageBody;
import com.meli.morsechallenge.restservice.helper.Translator;

/*
 * curl -d '{"text":"mensajetest"}' -H "Content-Type: application/json" -X POST http://localhost:8080/translate/2text
 */
@RestController
@RequestMapping(value = "/translate")
public class TranslatorController {


	@Autowired
	Translator translatorService;

	@PostMapping(value = "/2text", consumes = "application/json", produces = "application/json")
	public ResponseEntity<MessageBody> textToMorse(@RequestBody MessageBody messageBody, HttpServletResponse response) {
		return new ResponseEntity<MessageBody>(translatorService.stringToMorse(messageBody),HttpStatus.OK);
	}

	@PostMapping(value = "/2morse", consumes = "application/json", produces = "application/json")
	public ResponseEntity<MessageBody> morseToText(@RequestBody MessageBody messageBody) {
		return new ResponseEntity<MessageBody>(translatorService.translate2Human(messageBody),HttpStatus.OK);
	}

}
