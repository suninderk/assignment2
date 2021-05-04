package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
public static void main(String[]args) {
	System.out.println("Hello Merit America!");
	CDOffering cd;
	CDOffering[] offerings = new CDOffering[5];
	cd = new CDOffering(1,1.8/100);
	offerings[0] = cd;
	offerings[1] = new CDOffering(2,0.0019);
	offerings[2] = new CDOffering(3,0.002);
	offerings[3] = new CDOffering(5,0.0025);
	offerings[4] = new CDOffering(10,0.0022);
	MeritBank.setCDOfferings(offerings);
	AccountHolder ah1= new AccountHolder("John","Doe","James","123-456-7890");
	
	if (ah1.getCheckingBalance()+ah1.getSavingsBalance() < 250000) {
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
	}
	if (ah1.getCheckingBalance()+ah1.getSavingsBalance() < 250000) {
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);		
	}
	if (ah1.getCheckingBalance()+ah1.getSavingsBalance() < 250000) {
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);		
	}
	if (ah1.getCheckingBalance()+ah1.getSavingsBalance() < 250000) {
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);		
	}
	CDOffering offer = MeritBank.getBestCDOffering(1000);
	ah1.addCDAccount(offer, 1000);	
	MeritBank.addAccountHolder(ah1);	
	System.out.println("Account Holder 1 : "+ah1.toString());
	
	AccountHolder	ah2= new AccountHolder("A","B","C","123-456-7890");
	
	if (ah2.getCheckingBalance()+ah2.getSavingsBalance() < 250000) {
		ah2.addCheckingAccount(1000);
		//System.out.println("Here 3");
		ah2.addSavingsAccount(10000);
		//System.out.println("Here 4");
	}
	offer = MeritBank.getSecondBestCDOffering(1000);
	ah2.addCDAccount(offer, 1000);	
	MeritBank.addAccountHolder(ah2);
	System.out.println("Account Holder 2 : "+ah2.toString());
	
	MeritBank.clearCDOfferings();

	AccountHolder ah3 = new AccountHolder("Harry","B","Smith","123-456-7890");
	if (ah3.getCheckingBalance()+ah3.getSavingsBalance() < 250000) {
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);		
	}	
	MeritBank.addAccountHolder(ah3);
	System.out.println("Account Holder 3 : "+ah3.toString());
	
	System.out.println("Merit Bank Total Balance : "+ MeritBank.totalBalances());
	
	}
}
