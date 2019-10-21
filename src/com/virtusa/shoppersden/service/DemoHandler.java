package com.virtusa.shoppersden.service;

import java.security.Principal;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.virtusa.shoppersden.dao.CartDao;
import com.virtusa.shoppersden.dao.UserDao;
import com.virtusa.shoppersden.models.Cart;
import com.virtusa.shoppersden.models.CartItem;
import com.virtusa.shoppersden.models.Transactions;
import com.virtusa.shoppersden.models.User;

@Component("demoHandler")
public class DemoHandler {
	@Autowired
	UserDao us;
	@Autowired
	CartDao cs;
	
	@Autowired
	HttpServletRequest request;
	public User initFlow(){
		Principal principal = request.getUserPrincipal();
		User user=new User();
		user = us.getUserByName(principal.getName());
		//user.setCheckoutFlag(1);
	    //System.out.println(user.getCheckoutFlag());
		Cart cart = user.getCart();
		/*  Transactions transaction= new Transactions();
		  String name=user.getUsername();
		    double total=cart.getGrandTotal();
		    transaction.setUsername(name);
		    transaction.setGrandTotal(total);
		    System.out.println(transaction);*/
		   
		   
	//	td.saveTransaction(transaction);
		
		System.out.println("-----reached demo handler----");
		List<CartItem> cartitem1 = cart.getCartitem();
		ModelAndView mv = new ModelAndView("creditcard");
		mv.addObject("s", cartitem1);
		cartitem1.removeAll(cartitem1);
		cart.setCartitem(cartitem1);
		cart.setGrandTotal(0.0);
		cs.saveCart(cart);
		
		return user;
	}
	
}   
  
  
    
