package com.study.demo.service;

import org.springframework.stereotype.Service;

import com.study.demo.application.port.in.DemoManagementUseCase;

@Service("demoManagementService")
public class DemoManagementUseCaseImpl implements DemoManagementUseCase {

	@Override
	public String greet() {
		return "Hello World";
	}

}
