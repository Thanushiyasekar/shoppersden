package com.virtusa.shoppersden.dao;

import java.util.List;

import com.virtusa.shoppersden.models.Product;



public interface ProductDao {
public void addProduct(Product product);
	
	public Product getProductById(int id);
	public List<Product> getAllProduct();
	public void deleteProduct(int id);
	public List<Product> getDressProduct();
	public List<Product> getHtProduct();
	public List<Product> getTvProduct();
	

}
