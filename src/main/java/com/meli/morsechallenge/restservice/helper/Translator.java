package com.meli.morsechallenge.restservice.helper;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.meli.morsechallenge.restservice.domain.MessageBody;
import com.meli.morsechallenge.restservice.domain.MorseAlphabet;
import com.meli.morsechallenge.restservice.response.TranslatorResponse;

@Service
public class Translator {

	public final MorseAlphabet morseAlphabet = new MorseAlphabet();
	public final Validator validator = new Validator();
	public final TranslatorResponse translatorResponse = new TranslatorResponse();

	public TranslatorResponse stringToMorse(MessageBody messageBody) {

		String text = messageBody.getText().toLowerCase();

		if (!validator.isValidMessage(text)) {

			char[] charArray = text.toCharArray();

			String morse = "";

			for (int i = 0; i < charArray.length; i++) {

				if (String.valueOf(charArray[i]).equals(" ")) {

					morse = morse.concat("   ");

				} else {

					String charA = morseAlphabet.getAlphabet().get(String.valueOf(charArray[i]));
					morse = morse.concat(charA).concat(" ");

				}

			}
			
			translatorResponse.setText(morse);
			translatorResponse.setCode(HttpStatus.OK.value());
			translatorResponse.setHttpStatus(HttpStatus.OK);
			

			return translatorResponse;
		} else {
			
			translatorResponse.setText("El mensaje no es valido");
			translatorResponse.setCode(HttpStatus.BAD_REQUEST.value());
			translatorResponse.setHttpStatus(HttpStatus.BAD_REQUEST);

			return translatorResponse;

		}

	}

	public TranslatorResponse translate2Human(MessageBody messageBody) {
		
		String[] stringArray = messageBody.getText().split(" ");
		if (validator.isTrueMorse(messageBody.getText())) {
			String text = "";

			for (int i = 0; i < stringArray.length; i++) {

				if (stringArray[i].equals("")) {

					text = text.concat(" ");

				}else if(stringArray[i].equals(".-.-.-")) {
					translatorResponse.setText(text);
					translatorResponse.setCode(HttpStatus.OK.value());
					translatorResponse.setHttpStatus(HttpStatus.OK);
					return translatorResponse;
				}else {

					text = text.concat(getKeyFromValue(String.valueOf(stringArray[i])));
				}

			}
			translatorResponse.setText(text);
			translatorResponse.setCode(HttpStatus.OK.value());
			translatorResponse.setHttpStatus(HttpStatus.OK);
			return translatorResponse;
		}else {
			
			translatorResponse.setText("No es morse valido");
			translatorResponse.setCode(HttpStatus.BAD_REQUEST.value());
			translatorResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
			return translatorResponse;
		}

	}

	/*
	 * @Devuelve la key del hashmap alphabet mediante su value
	 */
	public String getKeyFromValue(String value) {

		return morseAlphabet.getAlphabet().entrySet().stream().filter(v -> v.getValue().equals(value))
				.map(Map.Entry::getKey).findFirst().orElse(null);
	}

}
