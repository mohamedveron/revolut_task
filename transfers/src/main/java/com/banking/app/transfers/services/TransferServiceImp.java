package com.banking.app.transfers.services;

import java.util.List;

import com.banking.app.transfers.Data;
import com.banking.app.transfers.models.Account;
import com.banking.app.transfers.models.Money;
import com.banking.app.transfers.models.Transfer;

public class TransferServiceImp implements TransferService{
	
	public Data data = new Data();

	@Override
	public String transferMoney(int from, int to, double amount, String currency) {
		// TODO Auto-generated method stub
		
		
		String result = "Transfer Success";
		
		Account fromAccount = getAccount(from);
		Account toAccount = getAccount(to);
		
		
		if(checkAccounts(from, to) < 2) {
			
			result = "One of the accounts that provided is not correct";
		}else if(checkBalance(amount, fromAccount.get_balance().get_amount())) {
			
			result = "You don't have enough balance to transfer";
		}else if(from == to){
			
			result = "you can't transfer to the same account";
		}else {
			
			data.transfersData.add(new Transfer(fromAccount, toAccount, new Money("USD", amount)));
		}
		
		return result;
	}
	
	
	@Override
	public List<Transfer> getAllTransfers() {
		// TODO Auto-generated method stub
		
		return data.transfersData;
	}
	
	// check if the two accounts exists
	private int checkAccounts(int from, int to) {
		
		int count = 0;
		
		for(Account account : data.accounts) {
			if(from == account.get_id() || to == account.get_id()) {
				count++;
			}
		}
		
		return count;
	}
	
	// check if account has enough balance
	private boolean checkBalance(double fromBalance, double amount) {
		
		
		return (fromBalance < amount) ? false : true;
	}
	
	
	private Account getAccount(int id) {
		
		Account acc = new Account();
		
		for(Account account : data.accounts) {
			if(id == account.get_id()) {
				acc = account;
			}
		}
		
		return acc;
	}

	

}
