package real.team12.week5;

public class Calculator {
	private BasicPlan plan = null;
	private double bill = 0;
	
	public void init(int aPlan, int aMinite, int aLine){
		if(aPlan == 1)
			this.plan = new Gold(aMinite, aLine);
		else
			this.plan = new Silver(aMinite, aLine);
		this.bill = 0;
	}
	public void additinalFee(int aLine){
		for(int i=1; i<aLine; i++)
			bill += plan.getAdditinalFee();
	}
	public void basicFee(){
		bill += plan.getBasicFee();
	}
	public int bill(){
		return (int)(bill*100);
	}
}
