package com.jinglun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/ftl")
	public String show1(){
		return "index1";
	}
	@RequestMapping("/jsp")
	public String show2(){
		return "MyJsp";
	}
}
