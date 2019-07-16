package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class HelloController {

	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}
	
}
