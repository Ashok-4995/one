package com.example.mydevapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Devcontroller {

	@GetMapping(value = "/get")
	public String get() {
		return "  This is from Auto configuration for jenkin ";
	}
}
