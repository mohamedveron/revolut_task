package com.banking.app.transfers.services;

import java.util.List;

import com.banking.app.transfers.Data;
import com.banking.app.transfers.DAL.AccountDAL;
import com.banking.app.transfers.models.Account;
import com.banking.app.transfers.models.Money;
import com.banking.app.transfers.models.Transfer;

public class TransferServiceImp implements TransferService{
	
	// intialize in memory data
	public Data data = new Data();
	
	// intialize data access layer for accounts 
	public AccountDAL accountDal = new AccountDAL();

	@Override
	public String transferMoney(int from, int to, double amount, String currency) {
		// TODO Auto-generated method stub
		
		
		String result = "Transfer Success !";
		
		Account fromAccount = accountDal.getAccount(from);
		Account toAccount = accountDal.getAccount(to);
		
		
		if(accountDal.checkAccounts(from, to) < 2) {
			
			result = "One of the accounts that provided is not correct";
		}else if(checkBalance(amount, fromAccount.get_balance().get_amount())) {
			
			result = "You don't have enough balance to transfer";
		}else if(from == to){
			
			result = "you can't transfer to the same account";
		}else {
			
			// reduce the balance of the from account
			accountDal.updateAccountBalance(fromAccount.get_id(), amount, -1);
			
			// add to the balance of the from account
			accountDal.updateAccountBalance(toAccount.get_id(), amount, 1);
			
			// add the transaction
			Data.transfersData.add(new Transfer(fromAccount, toAccount, new Money("USD", amount)));
		}
		
		return result;
	}
	
	
	@Override
	public List<Transfer> getAllTransfers() {
		// TODO Auto-generated method stub
		
		return Data.transfersData;
	}	
	
	// check if account has enough balance
	private boolean checkBalance(double fromBalance, double amount) {
		
		
		return (fromBalance < amount) ? false : true;
	}	

}
