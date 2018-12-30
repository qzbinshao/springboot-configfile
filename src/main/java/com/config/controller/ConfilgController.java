package com.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfilgController {
	@RequestMapping("/name")
	public String config() {
		return "name";
	}
}
