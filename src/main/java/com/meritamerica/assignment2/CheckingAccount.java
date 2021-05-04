package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{ 
	CheckingAccount(long actN, double openingBalance){
		super(actN, openingBalance,0.0001);
		//System.out.println("Inside Checking");
	}	
}