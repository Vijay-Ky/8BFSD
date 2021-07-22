package com.vijay.springmvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = 
				new StringTrimmerEditor(true); 	
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer
			theCustomer, BindingResult theBindingResult)
			
	{
		System.out.println("Current value of First Name field: " + theCustomer.getFirstName());
		System.out.println("Current value of Last Name field: " + theCustomer.getLastName());
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
	}
}
