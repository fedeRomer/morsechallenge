package com.meli.morsechallenge;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MorsechallengeApplicationTests {

	@Test
	void contextLoads() {
		String[] charAlphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", };

		String[] morseAlphabet = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", };
		int alphabetLength = 36;
		HashMap<String, String> alphabet = new HashMap<String, String>();

		for (int i = 0; i < alphabetLength; i++) {

			alphabet.put(charAlphabet[i], morseAlphabet[i]);
		}

		System.out.println("\nTest\n");
		alphabet.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});

	}

}
