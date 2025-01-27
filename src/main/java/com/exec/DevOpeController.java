package com.exec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpeController {
	@GetMapping("/hello")
	public String say() {
		return "Hello how are u";
	}
}
