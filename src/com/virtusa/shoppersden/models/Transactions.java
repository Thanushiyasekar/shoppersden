package com.virtusa.shoppersden.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Transactions implements Serializable{

	 

	    @Override
	    public String toString() {
	        return "Transactions [id=" + id + ", username=" + username + ", grandTotal=" + grandTotal + "]";
	    }
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    int id;
	    
	    String username;
	    double grandTotal;
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public double getGrandTotal() {
	        return grandTotal;
	    }
	    public void setGrandTotal(double grandTotal) {
	        this.grandTotal = grandTotal;
	    }

	 

	}
	 

