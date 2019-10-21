package com.virtusa.shoppersden.JUnit;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.virtusa.shoppersden.dao.CategoryDao;
import com.virtusa.shoppersden.daoimpl.CategoryDaoimpl;
import com.virtusa.shoppersden.models.Category;





public class CategoryDaoimplTest {



	@Test

	public void when()  {

		List<Category> li1=new ArrayList<Category>();
		CategoryDao cDao=new CategoryDaoimpl();
		Category category = cDao.getCategoryById(2);
		li1.add(category);
		List<Category> li2=new ArrayList<Category>();
		Category cat =  new Category(2,"ele");
		li2.add(cat);
		Assert.assertTrue(Arrays.equals(li1.toArray(),li2.toArray()));

	}


}


