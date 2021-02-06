package com.meli.morsechallenge.restservice.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public Boolean isValidMessage(String text) {
		if(text.isEmpty() || text.isBlank()) {
			return true;
		}
		Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		boolean validator = matcher.find();
		return validator;
	}

	public Boolean isTrueMorse(String text) {
		if(text.isEmpty() || this.isBlank(text)) {
			return false;
		}
		char dot = '.';
		char dash = '-';
		char space = ' ';
		int charCounter = 0;

		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (dot == charArray[i] || dash == charArray[i] || space == charArray[i]) {
				charCounter++;
			} else {
				return false;
			}
		}

		if (charCounter == charArray.length) {
			return true;
		}

		return false;

	}
	
	boolean isBlank(String string) {
	    return string == null || string.trim().isEmpty();
	}

}
