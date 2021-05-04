package com.meritamerica.assignment2;

import java.time.LocalDate;

public class CDAccount{
	CDOffering cdOffering; 
	double cdBalance;
		CDAccount(CDOffering offering, double balance){
				this.cdBalance = balance;
				this.cdOffering = offering;
		}
		public double getBalance() {
			return cdBalance;
		}
		public double getInterestRate() {
			return cdOffering.getInterestRate();
		}
		public int getTerm() {
			return cdOffering.getTerm();
		}
		public LocalDate getStartDate(){
			return LocalDate.now();
		}
		public long getAccountNumber() {
			return MeritBank.getNextAccountNumber();
		}
		double futureValue() {
			 return cdBalance*(Math.pow((1+(cdOffering.getInterestRate())), (cdOffering.getTerm())));
		}
}
