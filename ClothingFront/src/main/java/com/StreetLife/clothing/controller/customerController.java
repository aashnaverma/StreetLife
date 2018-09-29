package com.StreetLife.clothing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StreetLife.Clothing.dao.CustomerRepository;
import com.StreetLife.Clothing.dao.CustomerRepositoryImpl;
import com.StreetLife.Clothing.model.Customer;


@Controller
public class customerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/Login")
	public String Loginpage()
	{
		return "login";
	}
	
	
	
	
	@RequestMapping("/Sign")
   public String signup(Model model)
   {
		model.addAttribute("customer",new Customer());
		return "SignUp";
		
   }
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public String register(@ModelAttribute("customer")Customer customer) {
  System.out.println("model");
		customerRepository.addCustomer(customer);
	
		return "login";
	}

}
