package com.banking.app.transfers.models;

import java.util.List;

public class Customer {

	private String _name;
	
	private String _address;
	
	private List<Account>accounts;


	public Customer(String _name, String _address, List<Account> accounts) {
		super();
		this._name = _name;
		this._address = _address;
		this.accounts = accounts;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_address() {
		return _address;
	}

	public void set_address(String _address) {
		this._address = _address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
