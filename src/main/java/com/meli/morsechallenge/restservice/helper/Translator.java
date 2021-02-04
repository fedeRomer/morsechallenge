package com.meli.morsechallenge.restservice.helper;

import java.util.Map;

import org.springframework.stereotype.Service;
import com.meli.morsechallenge.restservice.domain.MessageBody;
import com.meli.morsechallenge.restservice.domain.MorseAlphabet;

@Service
public class Translator {

	public final MorseAlphabet morseAlphabet = new MorseAlphabet();

	public MessageBody stringToMorse(MessageBody messageBody) {

		char[] charArray = messageBody.getText().toCharArray();

		String morse = "";

		for (int i = 0; i < charArray.length; i++) {

			if (String.valueOf(charArray[i]).equals(" ")) {

				morse = morse.concat("  ");

			} else {

				String charA = morseAlphabet.getAlphabet().get(String.valueOf(charArray[i]));
				morse = morse.concat(charA);

			}

		}
		messageBody.setText(morse);
		return messageBody;
	}

	public MessageBody translate2Human(MessageBody messageBody) {
		String[] stringArray = messageBody.getText().split(" ");

		String text = "";

		for (int i = 0; i < stringArray.length; i++) {

			if (stringArray[i].equals("")) {

				text = text.concat(" ");

			} else {

				text = text.concat(getKeyFromValue(String.valueOf(stringArray[i])));
			}

		}
		messageBody.setText(text);
		return messageBody;
	}

	/*
	 * @Devuelve la key del hashmap alphabet mediante su value
	 */
	public String getKeyFromValue(String value) {

		return morseAlphabet.getAlphabet().entrySet().stream().filter(v -> v.getValue().equals(value))
				.map(Map.Entry::getKey).findFirst().orElse(null);
	}

}
