package com.meli.morsechallenge.restservice.domain;

public class MorseAlphabet {

	String[] morseAlphabet = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|" };

	public String[] getMorseAlphabet() {
		return morseAlphabet;
	}

}
