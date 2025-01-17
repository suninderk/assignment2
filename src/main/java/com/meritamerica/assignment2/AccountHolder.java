package com.meritamerica.assignment2;

import java.util.ArrayList;

public class AccountHolder {
	private String fN; 
	private String mN;
	private String lN;
	private String ssnNumber;
	CheckingAccount chk1;
	SavingsAccount sav1;
	CDAccount cd1;
	
	ArrayList<CheckingAccount> chkArray = new ArrayList<CheckingAccount>();
	ArrayList<SavingsAccount> savArray = new ArrayList<SavingsAccount>();
	ArrayList<CDAccount> cdArray = new ArrayList<CDAccount>();	
	AccountHolder(String firstName, String middleName, String lastName, String ssn){
		this.fN = firstName;
		this.mN=middleName;
		this.lN=lastName;
		this.ssnNumber=ssn;			
	}
	public String getFirstName(){
		return fN;
	}
	void setFirstName(String firstName) {
		this.fN=firstName;
	}
	public String getMiddleName(){
		return mN;
	}
	void setMiddleName(String middleName) {
		this.mN=middleName;
	}
	public String getLastName(){
		return lN;
	}
	void setLastName(String lastName) {
		this.lN=lastName;
	}
	public String getSSN(){
		return ssnNumber;
	}
	void setSSN(String SSN) {
		this.ssnNumber=SSN;
	}
	CheckingAccount addCheckingAccount(double openingBalance) {
		chk1=new CheckingAccount(openingBalance);
		if (chk1 != null) {
			chkArray.add(chk1);
			return chk1;
		}else return null;
	}
		
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if (checkingAccount != null) {
			if (getCombinedBalance() <250000) {
				chkArray.add(checkingAccount);
				return checkingAccount;				
			} else return null;
		}else return null;		
	}
	CheckingAccount[] getCheckingAccounts() {
		CheckingAccount[] chka;
		chka = new CheckingAccount[chkArray.size()];		
		if (chkArray != null) {
			Object[] objects = chkArray.toArray();
		    int i = 0;
			for (Object obj : objects) {
		    	System.out.print(obj + " ");
		    	chka[i] = (CheckingAccount)obj;
		    	i++;
		    }
		}		
		return chka;
	}
	int getNumberOfCheckingAccounts() {
		return chkArray.size();
	}	
	double getCheckingBalance() {
		double totalCheckingBalance = 0.00;
		for (int i=0; i < chkArray.size(); i++ ) {
			totalCheckingBalance = totalCheckingBalance+(chkArray.get(i).getBalance());
		}
		return totalCheckingBalance;
	}
	SavingsAccount addSavingsAccount(double openingBalance) {
		sav1=new SavingsAccount(openingBalance);
		if (sav1 != null) {
			savArray.add(sav1);
			return sav1;
		}else return null;		
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if (savingsAccount != null) {
			if (getCombinedBalance() <250000) {
				savArray.add(savingsAccount);
				return savingsAccount;				
			}else return null;
		}else return null;		
	}
	SavingsAccount[] getSavingsAccounts() {
		SavingsAccount[] sava;
		sava = new SavingsAccount[savArray.size()];		
		if (savArray != null) {
			Object[] objects = savArray.toArray();
		    int i = 0;
			for (Object obj : objects) {
		    	System.out.print(obj + " ");
		    	sava[i] = (SavingsAccount)obj;
		    	i++;
		    }
		}		
		return sava;
	}
	int getNumberOfSavingsAccounts() {
		return savArray.size();
	}
	double getSavingsBalance() {
		double totalSavingBalance = 0.00;
		for (int i=0; i < savArray.size(); i++ ) {
			totalSavingBalance = totalSavingBalance+(savArray.get(i).getBalance());
		}
		return totalSavingBalance;
	}
	CDAccount addCDAccount(CDOffering offering,double openingBalance) {
		//accountN = accountN+1;
		cd1=new CDAccount(offering,openingBalance);
		if (cd1 != null) {
			cdArray.add(cd1);
			return cd1;
		}else return null;
	}
	CDAccount addCDAccount(CDAccount cdAccount) {
		if (cdAccount != null) {
			cdArray.add(cdAccount);
			return cdAccount;
		}else return null;			
	}
	CDAccount[]getCDAccounts(){
		CDAccount[] cda;
		cda = new CDAccount[cdArray.size()];		
		if (cdArray != null) {
			Object[] objects = cdArray.toArray();
		    int i = 0;
			for (Object obj : objects) {
		    	System.out.print(obj + " ");
		    	cda[i] = (CDAccount)obj;
		    	i++;
		    }
		}
		return cda;
	}
	int getNumberOfCDAccounts() {
		return cdArray.size();
	}
	double getCDBalance() {
		double totalCDBalance = 0.00;
		for (int i=0; i < cdArray.size(); i++ ) {
			totalCDBalance = totalCDBalance+(cdArray.get(i).getBalance());
		}
		return totalCDBalance;
	}
	double getCombinedBalance() {
		//return	totalBalance= chk1.getBalance()+sav1.getBalance()+cd1.getBalance();
		return getCDBalance()+getSavingsBalance()+getCheckingBalance();
	}
	@Override
	public String toString() {
		return "AccountHolder [fN=" + fN + ", mN=" + mN + ", lN=" + lN + ", ssnNumber=" + ssnNumber + ", chk1=" + chk1
				+ ", sav1=" + sav1 + ", cd1=" + cd1 + ", chkArray=" + chkArray + ", savArray=" + savArray + ", cdArray="
				+ cdArray + "]";
	}

	
}