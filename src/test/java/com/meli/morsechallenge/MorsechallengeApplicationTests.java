package com.meli.morsechallenge;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class MorsechallengeApplicationTests {

	@Test
	void alphabetTest() {
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
	
	@Test
	void morseValidatorTest() {
		String text ="....  --- .-.. .- -- . .-.. .. ";
		String textNotValid = "dsada ---....-- ..--.- .dsadas $$$";
		char dot ='.';
		char dash ='-';
		char space =' ';
		
		
		char[] charArray = text.toCharArray();
		
		for(int i=0; i<charArray.length;i++) {
			if(dot == charArray[i] || dash == charArray[i] || space == charArray[i]) {
				System.out.println("VALID MORSE CHAR");;
			}else {
				System.out.println("NOT A VALID MORSE CHAR");
			}
		}
	}

}
