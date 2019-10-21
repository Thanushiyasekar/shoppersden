package com.virtusa.shoppersden.daoimpl;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.shoppersden.dao.TransactionsDao;
import com.virtusa.shoppersden.dao.UserDao;
import com.virtusa.shoppersden.models.Transactions;
import com.virtusa.shoppersden.models.User;

 


@Repository
public class TransactionsDaoImpl implements TransactionsDao {
    @Autowired
    SessionFactory sessionFactory;
    User user;
    @Autowired
    UserDao us;
    Transactions transaction;
/*    @Override
    public Transaction getTransaction(int id){
        
        System.out.println("Hello");
        Session session = sessionFactory.openSession();
        User user=us.getUserById(id);
        System.out.println(user.getTransactions());
        Transaction transaction= session.get(Transaction.class, id);
            session.close();
              return transaction;
        }*/
    
    public void saveTransaction(Transactions transactions)
    {
        Session session = sessionFactory.openSession();
        
        Transaction transaction = (Transaction)session.beginTransaction();
        
        session.save(transactions);
        transaction.commit();
        session.close();
    }
    }

 


 
