package com.virtusa.shoppersden.models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;

 
@Entity
public class CreditCard implements Serializable{
    

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Please Enter Number!!!!")
    private String cardnumber;
   // @NotBlank(message = "Please Enter The Expiry Month!!!!")
    private int month;
    //@NotBlank(message = "Please Enter The Expiry Year!!!!")
    private int year;
    @NotBlank(message = "Please Enter The  Name!!!!")
    private String cardholdername;
//    @NotBlank(message = "Please Enter The Bank!!!!")
//    private int cvv;
 //   private int user_id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCardnumber() {
        return cardnumber;
    }
    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getCardholdername() {
        return cardholdername;
    }
    public void setCardholdername(String cardholdername) {
        this.cardholdername = cardholdername;
    }
    @Override
	public String toString() {
		return "CreditCard [id=" + id + ", cardnumber=" + cardnumber + ", month=" + month + ", year=" + year
				+ ", cardholdername=" + cardholdername + "]";
	}
//    public String getBank() {
//        return bank;
//    }
//    public void setBank(String bank) {
//        this.bank = bank;
//    }
}