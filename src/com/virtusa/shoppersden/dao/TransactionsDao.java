package com.virtusa.shoppersden.dao;
import java.util.List;

import com.virtusa.shoppersden.models.Transactions;

public interface TransactionsDao {
//public Transaction getTransaction(int id);
public void saveTransaction(Transactions transaction);
}
