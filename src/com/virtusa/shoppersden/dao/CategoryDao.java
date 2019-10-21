package com.virtusa.shoppersden.dao;

import java.util.List;

import com.virtusa.shoppersden.models.Category;

public interface CategoryDao {
	public void SaveCategory(Category category);
	public List<Category> getAllCategory();
	public Category getCategoryById(int id);
	public void deleteProduct(int id);
	
	
}
