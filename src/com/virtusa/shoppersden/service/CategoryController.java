package com.virtusa.shoppersden.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.shoppersden.dao.CategoryDao;
import com.virtusa.shoppersden.models.Category;
import com.virtusa.shoppersden.models.Product;

@Controller
public class CategoryController {
@Autowired
	CategoryDao cs;
	@RequestMapping("/cat")
	public String getCatpage(Model model){
		
		model.addAttribute("category",new Category());
		model.addAttribute("cat", cs.getAllCategory());
		return "category";
	}
	
	@RequestMapping("/getcategory")
	public String getPage(@ModelAttribute Category category,Model model)
	{
		cs.SaveCategory(category);
		model.addAttribute("cat", cs.getAllCategory());
		
		
		
		return "redirect:/add";
	}
	@RequestMapping(value="/editcategory/{id}")
	 public ModelAndView edit(@PathVariable int id,Model model){  
	
       ModelAndView mv =new ModelAndView("category");  
       model.addAttribute("category", cs.getCategoryById(id));
       
       return mv;
   }  
	@RequestMapping(value="/deletecategory/{id}",method = RequestMethod.GET)
	public String delete(@PathVariable int id){
		  
		cs.deleteProduct(id);
		
		 
		 return "redirect:/cat";
		
	}
	}


