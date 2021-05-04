package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	SavingsAccount(long actN, double openingBalance){
		super(actN, openingBalance,0.0001);	
		//System.out.println("Inside Saving");
	}
	
}