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
import com.StreetLife.Clothing.dao.ProductRepoDao;
import com.StreetLife.Clothing.model.Category;
import com.StreetLife.Clothing.model.Product;


@Controller
public class ProductController {
	

   @Autowired
   ProductRepoDao productdao;
@Autowired
   CategoryRepository  categoryRepository;
   @RequestMapping(value="/adminaddProduct",method=RequestMethod.POST)
   public String productAdd(@ModelAttribute("pro")Product product)
   {
	   if(product.getProductId()==0)
	   {
		   productdao.addProduct(product);
		   
	   }
	   else {
		   productdao.addProduct(product);
	   }
	  return "redirect:/adminProduct";
   }
   
   @RequestMapping("/admindeleteProduct/{id}")
   public String productDelete(@PathVariable("id")int productId)
   {
	   productdao.deleteProduct(productId);
	   return "redirect:/adminProduct";
   }
   @RequestMapping("/admineditProduct/{id}")
   public String productUpdate(@PathVariable("id")int productId,Model model)
   {
	  
	   List<Product>allProduct=productdao.getAllProduct();
	   Product productData=productdao.getproductById(productId); 
	   model.addAttribute("pro", productData);
	   model.addAttribute("productList",allProduct);
	  
	   return "Product";
	   
	   
   
   
   }
	  @RequestMapping("/adminProduct")
public String productPage(Model model)
{		
		  List<Category>allCategory= categoryRepository.getAllCategory();
		  List<Product>allProduct=productdao.getAllProduct();
  model.addAttribute("pro",new Product());
  model.addAttribute("productList",allProduct);
  model.addAttribute("categoryList",allCategory);
 
  return "Product";
  
}
	  }
