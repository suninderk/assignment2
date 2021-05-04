package com.meritamerica.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MeritBank{
	static ArrayList<Double> ar = new ArrayList<Double>();
	static long mbAcNo  = 1;	
	
	static ArrayList<AccountHolder> mbAccHolderArray = new ArrayList<AccountHolder>();
	static ArrayList<CDOffering> mbOfferingsArray = new ArrayList<CDOffering>();	

	static void addAccountHolder (AccountHolder accountHolder) {
		mbAccHolderArray.add(accountHolder);
	}
	static AccountHolder[] getAccountHolders() {
		return (AccountHolder[])mbAccHolderArray.toArray();
	}
	static CDOffering[] getCDOfferings(){
		return (CDOffering[])mbOfferingsArray.toArray();
	}
	static CDOffering getBestCDOffering(double depositAmount) {
		int t=0;
		double r=0.00;
		double fv=0.00;
		HashMap<Double,CDOffering> hm = new HashMap<>();
		for (int i=0; i < mbOfferingsArray.size();i++) {
				t = mbOfferingsArray.get(i).getTerm();
				r = mbOfferingsArray.get(i).getInterestRate();
				fv = futureValue(depositAmount,r,t);
				//System.out.println("Future Value : "+fv);
				hm.put(fv, mbOfferingsArray.get(i));
			}
		TreeMap<Double,CDOffering> tm = new TreeMap<>(hm);
		return tm.lastEntry().getValue();
	}
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		int t=0;
		double r=0.00;
		double fv=0.00;
		HashMap<Double,CDOffering> hm = new HashMap<>();
		for (int i=0; i < mbOfferingsArray.size();i++) {
				t = mbOfferingsArray.get(i).getTerm();
				r = mbOfferingsArray.get(i).getInterestRate();
				fv = futureValue(depositAmount,r,t);
				//System.out.println("Future Value : "+fv);
				hm.put(fv, mbOfferingsArray.get(i));
			}
		TreeMap<Double,CDOffering> tm = new TreeMap<>(hm);
		int ind = tm.size()-2;
		return tm.get((double)ind);
	}
	@SuppressWarnings("null")
	static void clearCDOfferings() {
		mbOfferingsArray.clear();
	}
	static void setCDOfferings(CDOffering[] offerings) {
		mbOfferingsArray.clear();
		if (offerings !=null) {
			for(int i=0; i<offerings.length; i++) {
				mbOfferingsArray.add(offerings[i]);	
			}			
		}
	}
	static long getNextAccountNumber() {
		mbAcNo = mbAcNo+1;
		return mbAcNo;
	}
	static double totalBalances() {
		double totalBalance = 0.00;
		for (int i=0; i < mbAccHolderArray.size(); i++ ) {
			totalBalance=totalBalance+(mbAccHolderArray.get(i).getCombinedBalance());
		}
		return totalBalance;
	}
	static double futureValue(double PresentValue, double interestRate, int term) {
		 return PresentValue*(Math.pow((1+interestRate), term));
	}	
}
