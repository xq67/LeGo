package com.jinglun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJsp {
	@RequestMapping("/myjsp")
	public String ShowJsp(){
		return "MyJsp";
		
	}
}
