package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{ 
	CheckingAccount(double openingBalance){
		super(openingBalance,0.0001);
		//System.out.println("Inside Checking");
	}	
}