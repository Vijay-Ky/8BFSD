package com.vijay.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

	@RequestMapping("/htmlForm")
	public String displayPage()
	{
		return "simple";
	}
	
}
