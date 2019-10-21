package com.virtusa.shoppersden.daoimpl;

import java.security.Principal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.shoppersden.dao.CreditCardDao;
import com.virtusa.shoppersden.dao.UserDao;
import com.virtusa.shoppersden.models.Category;
import com.virtusa.shoppersden.models.CreditCard;
import com.virtusa.shoppersden.models.User;

@Repository
public class CreditCardDaoImpl implements CreditCardDao{
	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	UserDao us;
	@Override
	
	//save the card details to respective user 
	public void saveCreditCard(CreditCard creditcard) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction)session.beginTransaction();
		
		session.saveOrUpdate(creditcard);
		transaction.commit();
		session.close();
		System.out.println("Inside CreditCardDaoImpl ");
	}
	
	//unimplemented method
	public List<CreditCard> getallCreditcardDetailbyId(Principal principal){
		Session session = sessionFactory.openSession();
		User user=new User();
		user = us.getUserByName( principal.getName());
		int id = user.getId();
		List<CreditCard> b1= session.createQuery( "from user_creditcard where User_user_id = \"+\"'\" + id +\"'",CreditCard.class).list() ;  
		  session.close();
		  return b1;
		
	}

}
