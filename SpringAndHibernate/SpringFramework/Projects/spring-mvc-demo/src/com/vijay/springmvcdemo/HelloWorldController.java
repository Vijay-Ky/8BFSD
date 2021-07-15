package com.vijay.springmvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//initial form data
	@RequestMapping("/htmlForm")
	public String showPage()
	{
		return "hello-world-form";
	}
	
	//process the data
	@RequestMapping("/processHtmlForm")
	public String processRequest()
	{
		return "from-processRequest-method";
	}
	
	@RequestMapping("/processHtmlFormEdition2")
	public String speakOut(HttpServletRequest request, Model model)
	{
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Hi " + name;
		
		model.addAttribute("message", result);
		
		return "from-processRequest-method";
	}
	
	
	@RequestMapping("/processHtmlFormEdition3")
	public String speakOutLoud(@RequestParam("studentName") String theName,
			Model model)
	{
		
		theName = theName.toUpperCase();
		
		String result = "Hi Hello " + theName;
		
		model.addAttribute("message", result);
		
		return "from-processRequest-method";
	}
	
	
	
	
	
	
	
	
	
}
