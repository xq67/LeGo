package com.jinglun.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinglun.biz.L_pageShowBiz;

@RestController
public class JsonController {
	@Resource
	L_pageShowBiz l_pageShowBiz;
	
	@RequestMapping("/pageshow")
	public Map<String, Object> showPage(){
		Map<String, Object> map=l_pageShowBiz.getPageShow();
		return map;
	}
	
}
