package com.study.demo.service;

import org.springframework.stereotype.Service;

import com.study.demo.application.port.in.DemoManagementUseCase;

@Service("newDemoManagementService")
public class NewDemoManagementUseCaseImpl implements DemoManagementUseCase {

	@Override
	public String greet() {
		return "New Hello World";
	}

}
