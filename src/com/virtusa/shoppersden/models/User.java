package com.virtusa.shoppersden.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 3793551145727948169L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@NotBlank(message = "Please Enter The First Name!!!!")
	private String fname;
	@NotBlank(message = "Please Enter The Last Name!!!!")
	private String sname;
	@NotBlank(message = "Please Enter The User Name!!!!")
	private String username;
	@Size(min = 10,max = 12, message = "Enter The 10 Digit Number!!!")
	private String pnumber;
	@Email
	private String email;
	@Size(min = 8, message = "Your Password Is Weak!!!")
	private String password;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Address> addresses;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Cart cart;
   // @OneToMany(cascade=CascadeType.ALL, mappedBy="creditcard")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<CreditCard> creditcard;
	private String transcation;
		
	public String getTranscation() {
		return transcation;
	}

	public void setTranscation(String transcation) {
		this.transcation = transcation;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private boolean enabled;
	private String role;
    

	
	public List<CreditCard> getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(List<CreditCard> creditcard) {
		this.creditcard = creditcard;
	}

	public int getId() {
		return user_id;
	}

	public void setId(int id) {
		this.user_id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	

}
