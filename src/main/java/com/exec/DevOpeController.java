package com.exec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpeController {
	@GetMapping("/hello")
	public String say() {
		return "Hello how are u";
	}
	@GetMapping("/card")
	public String payment() {
		return "eneter card details. yes accepted";
	}
	@GetMapping("/upi")
	public String payment1() {
		return "eneter upi details. yes accepted";
	}
}
