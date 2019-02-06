package com.banking.app.transfers.models;

import java.util.List;

public class Account {

	private int _id;
	
	private Money _balance;
	
	private Customer _customer;
	
	private List<Transfer>transfers;
	
	public Account() {
		
	}

	public Account(int _id, Money _balance, Customer _customer, List<Transfer> transfers) {
		super();
		this._id = _id;
		this._balance = _balance;
		this._customer = _customer;
		this.transfers = transfers;
	}

	public Money get_balance() {
		return _balance;
	}

	public void set_balance(Money _balance) {
		this._balance = _balance;
	}

	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer _customer) {
		this._customer = _customer;
	}

	public List<Transfer> getTransfers() {
		return transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}
	
	
}
