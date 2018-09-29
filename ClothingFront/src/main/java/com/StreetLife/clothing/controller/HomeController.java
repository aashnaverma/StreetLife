package com.StreetLife.clothing.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.StreetLife.Clothing.dao.CategoryRepository;
import com.StreetLife.Clothing.model.Category;

@Controller
public class HomeController {
 	
 
	
	 @RequestMapping("/")
	 public String homepage()
	 {
		 return "index";
	 }
	 
	 
	  @RequestMapping("/home")
	  public String index()
	  {
		 
		  return "index";
	  }
	  
	  	@RequestMapping("/Admin")
	  	
	  		public String adminhome()
	  		{
	  			return "Admin";
	  		}
	  
	  
	  }
	 
