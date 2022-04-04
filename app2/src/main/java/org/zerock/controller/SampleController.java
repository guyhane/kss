package org.zerock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("aaa");
		return "Hello World";
	}

}
