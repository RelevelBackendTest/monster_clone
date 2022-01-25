package com.relevel.backend.monster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonsterController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

