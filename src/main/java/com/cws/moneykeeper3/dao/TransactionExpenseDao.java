package com.cws.moneykeeper3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cws.moneykeeper3.model.TransactionExpense;

public interface TransactionExpenseDao extends CrudRepository<TransactionExpense, Integer> {
	@Query("FROM TransactionExpense a WHERE a.idParent = 0")
	public List<TransactionExpense> search1();

	@Query(nativeQuery = true, value = "SELECT * FROM transaction_expense  WHERE name like 'Lend' ")
	public List<TransactionExpense> search2();

}
