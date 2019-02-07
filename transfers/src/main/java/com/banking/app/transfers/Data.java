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
		Customer customer3 = new Customer("henry", "london, England", new ArrayList<Account>());
		Customer customer4 = new Customer("mark", "paris, France", new ArrayList<Account>());
		
		Money money1 = new Money("USD", 10000);
		Money money2 = new Money("USD", 30000);
		Money money3 = new Money("USD", 120000);
		Money money4 = new Money("USD", 20000);
		
		Account account1 = new Account(1, money1, customer1, new ArrayList<Transfer>());
		Account account2 = new Account(2, money2, customer2, new ArrayList<Transfer>());
		Account account3 = new Account(3, money3, customer3, new ArrayList<Transfer>());
		Account account4 = new Account(4, money4, customer4, new ArrayList<Transfer>());
		
		this.accounts.add(account1);
		this.accounts.add(account2);
		this.accounts.add(account3);
		this.accounts.add(account4);
	}
}
