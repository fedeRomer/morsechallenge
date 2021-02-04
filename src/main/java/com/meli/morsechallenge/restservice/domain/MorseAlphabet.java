package com.meli.morsechallenge.restservice.domain;

import java.util.HashMap;

public class MorseAlphabet {

	String[] charAlphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", };

	String[] morseAlphabet = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", };

	HashMap<String, String> alphabet = new HashMap<String, String>();

	public HashMap<String, String> loadAlphabet() {
		
		for (int i = 0; i < 36; i++) {
						//key = char humano --- value = morse
			alphabet.put(charAlphabet[i], morseAlphabet[i]);

		}
		return alphabet;
	}

	public HashMap<String, String> getAlphabet() {
		return loadAlphabet();
	}

}
