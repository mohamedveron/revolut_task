package com.banking.app.transfers;
import static spark.Spark.*;

public class App 
{
	
	
    public static void main( String[] args )
    {
    	get("/hello", (req, res) -> "Hello World ya zmely");
    	
    	get("/try", (req, res) -> "you must try to be a great one");
    
    }
}
