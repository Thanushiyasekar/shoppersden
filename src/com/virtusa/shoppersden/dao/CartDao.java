package com.virtusa.shoppersden.dao;

import java.util.List;

import com.virtusa.shoppersden.models.Cart;
import com.virtusa.shoppersden.models.CartItem;
import com.virtusa.shoppersden.models.User;

public interface CartDao {
	 public Cart getCartById (int cartId);
	   
		    public void saveCart(Cart cart);
		    List<Cart> getCartByUsername (String username);
            public Cart getGrandTotal();

		
}
