package com.banking.app.transfers.services;

import java.util.List;

import com.banking.app.transfers.models.Transfer;

public interface TransferService {
	
	public String transferMoney(int from, int to, double amount, String currency);
	
	public List<Transfer> getAllTransfers();
}
