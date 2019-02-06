package com.banking.app.transfers.models;

public class TransferRequest {
	
	public int fromId;
	public int toId;
	public double amount;
	public String currency;
	
	public TransferRequest(int _fromId, int _toId, double _amount, String _currency) {
		super();
		this.fromId = _fromId;
		this.toId = _toId;
		this.amount = _amount;
		this.currency = _currency;
	}

	public int get_fromId() {
		return fromId;
	}

	public void set_fromId(int _fromId) {
		this.fromId = _fromId;
	}

	public int get_toId() {
		return toId;
	}

	public void set_toId(int _toId) {
		this.toId = _toId;
	}

	public double get_amount() {
		return amount;
	}

	public void set_amount(double _amount) {
		this.amount = _amount;
	}

	public String get_currency() {
		return currency;
	}

	public void set_currency(String _currency) {
		this.currency = _currency;
	}
	
	
}
