package com.banking.app.transfers;
import java.util.ArrayList;
import java.util.List;

import com.banking.app.transfers.models.*;

public class Data {
	public static List<Transfer>transfersData; 
	public static List<Account>accounts; 
	
	
	public Data() {
		this.transfersData = new ArrayList<Transfer>();
		this.accounts = new ArrayList<Account>();
		
		Customer customer1 = new Customer("mohamed veron", "Haram street, egypt", new ArrayList<Account>());
		Customer customer2 = new Customer("marwan", "Dokki, egypt", new ArrayList<Account>());
		
		Money money1 = new Money("USD", 10000);
		Money money2 = new Money("USD", 30000);
		
		Account account1 = new Account(1, money1, customer1, new ArrayList<Transfer>());
		Account account2 = new Account(2, money2, customer2, new ArrayList<Transfer>());
		
		this.accounts.add(account1);
		this.accounts.add(account2);
	}
}
