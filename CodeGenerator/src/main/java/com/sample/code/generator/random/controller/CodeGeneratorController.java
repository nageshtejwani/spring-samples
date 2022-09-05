package com.sample.code.generator.random.controller;

import java.util.List;

import org.apache.logging.log4j.util.Base64Util;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.code.generator.model.RoleDTO;
import com.sample.code.generator.random.RandomCodeGenerator;
import com.sample.code.generator.service.RoleService;

@RestController
public class CodeGeneratorController {

	private final RandomCodeGenerator codeGenerator;
	private final RoleService roleService;

	public CodeGeneratorController(RandomCodeGenerator codeGenerator, RoleService roleService) {
		super();
		this.codeGenerator = codeGenerator;
		this.roleService = roleService;
	}

	@GetMapping("/secretcode")
	public String fetchSecretCode() {
		return Base64Util.encode(codeGenerator.generateRandomString());
	}

	
	@PostMapping(path = "role", 
    consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createRole(@RequestBody RoleDTO roleDTO) {
		roleService.saveRole(roleDTO);
	}

	@GetMapping("/role/{id}")
	public RoleDTO getRole(@RequestParam long id) {
		return roleService.getRole(id);
	}

	@GetMapping("/role")
	public List<RoleDTO> getRoles() {
		return roleService.getRoles();
	}

}
