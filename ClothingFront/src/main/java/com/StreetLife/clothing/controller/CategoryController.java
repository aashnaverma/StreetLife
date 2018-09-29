package com.StreetLife.clothing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StreetLife.Clothing.dao.CategoryRepository;
import com.StreetLife.Clothing.model.Category;

@Controller
public class CategoryController {
	
	
	@Autowired
	private Category category;

	@Autowired
	CategoryRepository categoryRepository;
	
	 @RequestMapping("/admincategory")
	  public String categoryPage(Model model)
	  {
			  List<Category>allCategories=categoryRepository.getAllCategory();
	     model.addAttribute("cat",category);
	     model.addAttribute("categoryList",allCategories);
	     return "category";
	     
	  }
	
	@RequestMapping(value="/adminaddCategory",method=RequestMethod.POST)
	public String categoryAdd(@ModelAttribute("cat")Category category)
{
		   if(category.getCategoryId()==0)
		   {
			   categoryRepository.addCategory(category) ;
		
			   
		   }
		   else {
	categoryRepository.addCategory(category);
		   }
	return "redirect:/admincategory";
	
}

@RequestMapping("/admindeleteCategory/{id}")
  public String categoryDelete(@PathVariable("id")int categoryId)
  {
	categoryRepository.deleteCategory(categoryId);
	return "redirect:/admincategory";
	
  }

@RequestMapping("/admineditCategory/{id}")
public String categoryUpdate(@PathVariable("id")int categoryId,Model model)
{
	Category categoryData=categoryRepository.getCategoryById(categoryId);
	model.addAttribute("cat",categoryData);
	List<Category>allCategory=categoryRepository.getAllCategory();
	model.addAttribute("categoryList",allCategory);
	return "category";
}
}