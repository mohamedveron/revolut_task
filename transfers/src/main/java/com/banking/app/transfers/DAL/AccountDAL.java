package com.banking.app.transfers.DAL;

import com.banking.app.transfers.Data;
import com.banking.app.transfers.models.Account;
import com.banking.app.transfers.models.Money;

public class AccountDAL {
	
	// check if the two accounts exists
	public int checkAccounts(int from, int to) {
		
		int count = 0;
		
		for(Account account : Data.accounts) {
			if(from == account.get_id() || to == account.get_id()) {
				count++;
			}
		}
		
		return count;
	}
	
	
	public Account getAccount(int id) {
		
		for(Account account : Data.accounts) {
			if(id == account.get_id()) {
				return account;
			}
		}
		
		return null;
	}
	
	
	
	public void updateAccountBalance(int accountId, double amount, int type) {
		
		for(Account account : Data.accounts) {
			
			if(accountId == account.get_id()) {
				
				account.set_balance(new Money("USD", account.get_balance().get_amount() + (amount * type)));
				
				break;

			}
		}
	}
}
