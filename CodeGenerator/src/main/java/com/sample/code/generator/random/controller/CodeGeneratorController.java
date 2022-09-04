package com.sample.code.generator.random.controller;

import org.apache.logging.log4j.util.Base64Util;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.code.generator.random.RandomCodeGenerator;

@RestController
public class CodeGeneratorController {
	
	private final RandomCodeGenerator codeGenerator;
	public CodeGeneratorController(RandomCodeGenerator codeGenerator) {
		super();
		this.codeGenerator = codeGenerator;
	}

	@GetMapping("/secretcode")
	public String fetchSecretCode() {
		return Base64Util.encode(codeGenerator.generateRandomString());
	}

}
