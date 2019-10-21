package com.virtusa.shoppersden.service;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.shoppersden.dao.CreditCardDao;
import com.virtusa.shoppersden.dao.ProductDao;
import com.virtusa.shoppersden.dao.UserDao;
import com.virtusa.shoppersden.models.Address;
import com.virtusa.shoppersden.models.CreditCard;
import com.virtusa.shoppersden.models.Product;
import com.virtusa.shoppersden.models.User;

@Controller
public class PageController {
	@Autowired
	UserDao us;
@Autowired
ProductDao ps;	
@Autowired
CreditCardDao cc;

	// home page
	@RequestMapping(value = { "/home", "/" })
	public String getHomePage( ) {
		return "home";
	}
	
	//user's list
	@RequestMapping("/ul")
	public ModelAndView getCrudPage(Model model) {
		ModelAndView mv = new ModelAndView("crud");
		mv.addObject("user", new User());
		model.addAttribute("users", us.getAllUser());
		return mv;
	}
	
	//user registration
	@RequestMapping("/registration")
	public ModelAndView getRegistrationPage() {
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("user", new User()); 
		return mv;
	}
	
	//login page
	@RequestMapping("/login")
	public String getLoginPage(Model model,@RequestParam(name = "error", required = false) String error) {
		if (error != null) {
			model.addAttribute("message", "Invalid Username and Password");
		}
		return "login";
	}
	//Home Theatre
	@RequestMapping("/ht")
	public String getWomenPage(Model model) {
		model.addAttribute("view", ps.getHtProduct());
		//model.addAttribute("product",product);
		return "ht";
	}
	//Dress
	@RequestMapping("/dress")
	public String getMenPage(Model model) {
		
		model.addAttribute("view", ps.getDressProduct());
		//model.addAttribute("product",product);
		return "ht";
	}
	//TV
	@RequestMapping("/tv")
	public String getKidspage(Model model){
		model.addAttribute("view",ps.getTvProduct() );
		return "tv";
	}

		// user registration validation
	@RequestMapping(value = "getuser", method = RequestMethod.POST)

	public String getuser( @ModelAttribute("user") User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "registration";
		}

		System.out.println("validated successfully!!!");
		
		user.setRole("USER");
		user.setEnabled(true);
		us.addUser(user);

		System.out.println("your Registration Get Succeed");
		System.out.println("---------------------------------------------------------");
		System.out.println("The User Id : " + user.getId());

		System.out.println("------------------Thank You------------------------------");

		model.addAttribute("user", user);
		model.addAttribute("address", new Address());
		//model.addAttribute("check", new CreditCard());
		return "address";
	}
	
	// after user registration address field
	@RequestMapping("/usadd/{id}")
	public String getAddressPage(@Valid @ModelAttribute Address address, BindingResult result, @PathVariable int id,
			Model model, @RequestParam("action") String action) {
		if (result.hasErrors()) {
			return "address";
		}
		System.out.println("the area is:" + address.getArea());
		User user = us.getUserById(id);
		List<Address> addresses = user.getAddresses();
		addresses.add(address);
		user.setAddresses(addresses);
		us.updateUser(user);
		switch (action.toLowerCase()) {
		case "submit":
			return "redirect:/success";
		}
		model.addAttribute("user", user);
		model.addAttribute("address", new Address());
		return "address";
	}
	
	
	// final success
	@RequestMapping("/success")
	public String getSuccessPage() {
		return "success";
	}
	
	// change address in cart field(incomplete)
	@RequestMapping("/_eventId_edit")
	public String getConfirmPage(Model model,Principal principal)
	
	{   User user=us.getUserByName(principal.getName());
		model.addAttribute("user", user);
		model.addAttribute("address",us.getAddressById(user.getId()));
		return "address";
	}
	
	//another address field
	@RequestMapping("/asadd/{id}")
	public String getConPage(@Valid @ModelAttribute Address address,BindingResult result, @PathVariable int id,Model model, @RequestParam("action") String action)
	{   
		if (result.hasErrors()) {
			return "address";		}
		User user = us.getUserById(id);
		us.updateUser(user);
		model.addAttribute("user", user);
		model.addAttribute("address", new Address());
		return "address";
	}
	
	@RequestMapping("/creditcard")
	public String getPaymentPage(Model model,Principal principal) {
		model.addAttribute("creditcard",new CreditCard());
		User user = us.getUserByName(principal.getName());		
		model.addAttribute("user_id", user.getId());
		System.out.println("From getPaymentPage user id------> "+user.getId());
		return "creditcard";
		
	}
	
	  @RequestMapping(value="/deletePassword/{id}",method = RequestMethod.GET)
	    public String delete(@PathVariable int id){
	        us.deleteUser(id);
	         return "redirect:/ul";
	    }
	
	  @RequestMapping("/getTransactionDetails/{id}")
	    public String getDetails(Model model,Principal principal,@PathVariable int id)
	    {
	       
	        User user=us.getUserById(id);
	        System.out.println(user.getUsername()+"---------------------------");
	   
	        
	        //model.addAttribute("transaction",td.getTransaction(id));
	          model.addAttribute("user",us.getUserById(id));
	       
	        return "transactiondetails";
	    }
	  
	@RequestMapping("/savecreditcard/{id}")
	public String saveCreditCardDetails( @ModelAttribute("creditcard") CreditCard card, @PathVariable int id,BindingResult result, ModelAndView mv) {
		System.out.println("From saveCreditCardDetails user id"+id);
		User user = us.getUserById(id);
        List<CreditCard> ccardlist = user.getCreditcard();
        ccardlist.add(card);
        us.updateUser(user);
		System.out.println("inside saveCreditCardDetails method in page controller");
		cc.saveCreditCard(card);
		return "redirect:/home";
	}
	@RequestMapping("/FAQ")
	public String getQuestionsPage() {
		return "faq";
	}
	@RequestMapping("/help")
	public String getHelpPage() {
		return "Help";
	}
}

