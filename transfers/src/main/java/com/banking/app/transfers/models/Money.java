package com.banking.app.transfers.models;

public class Money {

	private String _currency;
	
	private double _amount;

	public Money(String _currency, double _amount) {
		super();
		this._currency = _currency;
		this._amount = _amount;
	}

	public String get_currency() {
		return _currency;
	}

	public void set_currency(String _currency) {
		this._currency = _currency;
	}

	public double get_amount() {
		return _amount;
	}

	public void set_amount(double _amount) {
		this._amount = _amount;
	}
	
	
}
