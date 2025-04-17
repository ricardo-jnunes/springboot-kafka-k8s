package com.study.demo.adapters.in.rest.constroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	

	@GetMapping("/")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> saveSomething(@RequestParam String id) {
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
