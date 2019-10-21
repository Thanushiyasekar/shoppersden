package com.virtusa.shoppersden.dao;

import java.util.List;

import com.virtusa.shoppersden.models.Cart;
import com.virtusa.shoppersden.models.CartItem;
import com.virtusa.shoppersden.models.Product;
import com.virtusa.shoppersden.models.User;

public interface CartItemDao {
	public void deleteCartItem(int id);
	//public CartItem getCartItemByProductId(int id,int cartid);
	public List<CartItem> getAllcartitem();
	public CartItem	 getCartitemById(int id);
	public void update(CartItem cartitem);

	
}
