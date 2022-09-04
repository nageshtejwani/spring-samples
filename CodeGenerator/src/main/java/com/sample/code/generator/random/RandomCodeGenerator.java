package com.sample.code.generator.random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class RandomCodeGenerator {

	private static final int STRING_LENGTH = 10;
	
	public String generateRandomString() {
		return  RandomStringUtils.randomAlphanumeric(STRING_LENGTH);
	}
}
