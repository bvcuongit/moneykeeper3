package com.cws.moneykeeper3.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cws.moneykeeper3.model.TransactionExpense;
import com.cws.moneykeeper3.rsp.MultipleRsp;
import com.cws.moneykeeper3.rsp.SingleRsp;
import com.cws.moneykeeper3.service.TransactionExpenseService;

@RestController
@RequestMapping(value = "/TransactionExpense")
public class TransactionExpenseController {
	// region -- Fields--

	@Autowired
	private TransactionExpenseService transactionExpenseService;

	// end

	@RequestMapping(value = "/search1", method = RequestMethod.GET)
	public ResponseEntity<?> search(@RequestHeader HttpHeaders header) {
		MultipleRsp res = new MultipleRsp();

		try {
			// Handle
			List<TransactionExpense> tmp = transactionExpenseService.search1();
			// Set data
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("count", tmp.size());
			data.put("data", tmp);
			data.put("toan", "OKKK");
			res.setResult(data);
		} catch (Exception ex) {
			res.setCallstatus("error");
			res.setMessage(ex.getMessage());
		}

		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@RequestMapping(value = "/search2", method = RequestMethod.GET)
	public ResponseEntity<?> search2(@RequestHeader HttpHeaders header) {
		SingleRsp res = new SingleRsp();

		try {
			// Handle
			List<TransactionExpense> tmp = transactionExpenseService.search2();
			// Set data
			res.setResult(tmp);
		} catch (Exception ex) {
			res.setCallstatus("error");
			res.setMessage(ex.getMessage());
		}

		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
