package com.meritamerica.assignment2;

public class BankAccount {
	private double bal;
	private double iRate;
	private long accNumber;

	BankAccount(double Balance, double interestRate){
		this.accNumber = MeritBank.getNextAccountNumber();
		this.bal = Balance;
		this.iRate = interestRate;
		//System.out.println("Inside BankAccount");
		}
	
	public long getAccountNumber() {
		return accNumber;
		}
	
	public double getBalance() {
		return bal;
		}
	
	public double getInterest() {
		return iRate;
		}
	
	public boolean withdraw(double amount) {
		if (amount < 0) return false;
		double b = bal - amount;
		if (b<0) {
			return false;
		}else {
			bal = bal - amount;
			return true;
		}
	}
	
	public boolean deposit(double amount) {
		
		if (amount> 0){
			bal = bal+amount;
			return true;
			
			}
		else {
			return false;
			}
	}
	
	public double futureValue(int years) {
		//years = new Double(years);
		 return bal*(Math.pow((1+iRate), years));
	 		}

	@Override
	public String toString() {
		return "BankAccount [bal=" + bal + ", iRate=" + iRate + ", accNumber=" + accNumber + "]";
	}
	
}
