package com.banking.app.transfers.models;

public class Transfer {
	
	private Account _fromAccount;
	
	private Account _toAccount;
	
	private Money _amount;
	

	public Transfer(Account _fromAccount, Account _toAccount, Money _amount) {
		super();
		this._fromAccount = _fromAccount;
		this._toAccount = _toAccount;
		this._amount = _amount;
	}

	public Account get_fromAccount() {
		return _fromAccount;
	}

	public void set_fromAccount(Account _fromAccount) {
		this._fromAccount = _fromAccount;
	}

	public Account get_toAccount() {
		return _toAccount;
	}

	public void set_toAccount(Account _toAccount) {
		this._toAccount = _toAccount;
	}

	public Money get_amount() {
		return _amount;
	}

	public void set_amount(Money _amount) {
		this._amount = _amount;
	}
	
}
