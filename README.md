# revolut_task
The REST Api for money transfer. Technologies used:

1- Spark framework for REST

2- Maven as project management tool

3- Gson for json mapping


# Notes

1- I assumed that all transfers will be with just USD currency to avoid currency conversion to avoid complexity. 

2- You have in memory 4 accounts to use:

		 account1 : id = 1, balance = 10000
		 
		 account2 : id = 2, balance = 30000
		 
		 account3 : id = 3, balance = 120000
		 
		 account4 : id = 4, balance = 2000


# Usage

To run the application:

1- mvn clean install

2- when you run the app it will start in the default port http://localhost:4567


# Api's

1- One of the ways to transfer money with just the url

		Method : Get
		
		url : /transfer?fromId=1&toId=2&amount=1000&currency=%22USD%22
		
2- One of the ways to transfer money with post request with body object

		Method : POST
		
		url : /transfer
		
		body : {
		
						"fromId": 2,
						
						"toId": 1,
						
						"amount": 1000,
						
						"currency": "USD"
						
					}
3- Get all transfers

		Method : Get
		
		url : /getTransfers
					

		
