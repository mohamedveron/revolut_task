package com.banking.app.transfers.controllers;

import static spark.Spark.*;

import com.banking.app.transfers.models.TransferRequest;
import com.banking.app.transfers.services.TransferService;
import com.banking.app.transfers.services.TransferServiceImp;
import com.google.gson.Gson;

public class TransfersEndPoints {
	
	private static  TransferService transferService;

	public static void TransfersController() {
		
		transferService = new TransferServiceImp();
		
		
		// get Rest API
		get("/transfer", (req, res) -> {
			
			int fromId = 1;
			int toId = 2;
			double amount = 1000;
			String currency = "USD";
			
			try {
				
				fromId = Integer.parseInt(req.queryParams("fromId"));
				toId = Integer.parseInt(req.queryParams("toId"));
				amount = (double)Integer.parseInt(req.queryParams("amount"));
				currency = req.queryParams("currency");
				
			}catch(Exception ex) {
				
				return "Wrong parameters provided";
			}
			
			
			return transferService.transferMoney(fromId, toId, amount, currency);
		
		});
		
		// post Rest API
		post("/transfer", (req, res) -> {
			
			TransferRequest request = new Gson().fromJson(req.body(), TransferRequest.class);
			
			return transferService.transferMoney(request.fromId, request.toId, request.amount, request.currency);
		
		});
		
		
		// get all transfers
		get("/getTransfers", (req, res) -> {
						
			return  new Gson().toJson(transferService.getAllTransfers());
		
		});
		
	}
}
