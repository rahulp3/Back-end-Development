package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello") //Used to map the fn to the URL
	public String helloMsgReneder() {
		return "hello";
	}
}
