package com.cws.moneykeeper3.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cws.moneykeeper3.dao.TransactionExpenseDao;
import com.cws.moneykeeper3.model.TransactionExpense;
import com.cws.moneykeeper3.service.TransactionExpenseService;

@Service(value = "transactionExpenseService")
@Transactional
public class TransactionExpenseImpl implements TransactionExpenseService {
	// Region-- Fields--
	@Autowired
	private TransactionExpenseDao transactionExpenseDao;

	// end
	
	
	@Override
	public List<TransactionExpense> search1() {
		List<TransactionExpense> res =  transactionExpenseDao.search1();
		return res;
	}

	@Override
	public List<TransactionExpense> search2() {

		return transactionExpenseDao.search2();
	}



}
