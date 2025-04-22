package com.study.demo.adapters.in.rest.constroller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.demo.application.port.in.DemoManagementUseCase;

@RestController
@RequestMapping("/demo")
public class DemoController {

	private final DemoManagementUseCase demoService;
	private final DemoManagementUseCase newDemoService;

	public DemoController(@Qualifier("demoManagementService") DemoManagementUseCase demoService,
			@Qualifier("newDemoManagementService") DemoManagementUseCase newDemoService) {
		this.demoService = demoService;
		this.newDemoService = newDemoService;
	}

	@GetMapping("/")
	public ResponseEntity<String> helloWorld(@RequestHeader(name = "flow", required = false) String flow) {
		DemoManagementUseCase service = "new".equalsIgnoreCase(flow) ? newDemoService : demoService;

		return new ResponseEntity<String>(service.greet(), HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<String> saveSomething(@RequestParam String id) {
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
