package com.virtusa.shoppersden.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category implements Serializable{
	
	private static final long serialVersionUID = -1765393024257142335L;
	public Category(){
		
	}
	public Category(int id, String cname) {
		this.id = id;
		this.cname = cname;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public

    int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	String cname;

}
