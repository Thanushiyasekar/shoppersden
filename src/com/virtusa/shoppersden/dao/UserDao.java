package com.virtusa.shoppersden.dao;

import java.security.Principal;
import java.util.List;

import com.virtusa.shoppersden.models.Address;
import com.virtusa.shoppersden.models.User;

public interface UserDao {
	public void addUser(User user);
	public void updateUser(User user);
	
	public User getUserById(int id);
	public List<User> getAllUser();
	public void deleteUser(int id);
	public User getUserByName(String name);
	public void saveUser(User user);
	public Address getAddressById(int id); 
	

}
