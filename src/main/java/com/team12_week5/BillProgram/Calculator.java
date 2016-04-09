package com.team12_week5.BillProgram;

public class Calculator {
	private BasicPlan plan = null;
	private double bill = 0;
	
	public Calculator(){
	}
	public void init(int aPlan, int aMinite, int aLine){
		if(aPlan == 1)
			this.plan = new Gold(aMinite, aLine);
		else if(aPlan == 2)
			this.plan = new Silver(aMinite, aLine);
		this.bill = 0;
	}
	public void additinalFee(){
		bill += plan.getAdditinalFee();
	}
	public void basicFee(){
		bill += plan.getBasicFee();
	}
	public int bill(){
		return (int)(bill*100);
	}
}
