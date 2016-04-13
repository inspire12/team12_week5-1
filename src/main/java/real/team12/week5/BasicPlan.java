package real.team12.week5;

public class BasicPlan {
	protected double basicFee=0; 
	protected double additionalFee=0; 
	protected double freeTime=0; 
	protected double excessFee=0; 
	protected double minit=0; 
	protected double line=0; 
	public BasicPlan(double aBasicFee, double aAdditionalFee, double aFreeTime, double aExcessFee, double aMinit, double aLine){
		this.basicFee = aBasicFee;
		this.additionalFee = aAdditionalFee;
		this.freeTime = aFreeTime;
		this.excessFee = aExcessFee;
		this.minit = aMinit;
		this.line = aLine;
	}
	
	public double getBasicFee() {
		return basicFee;
	}
	public double getAdditinalFee() {
		return additionalFee;
	}
	public double getFreeTime() {
		return freeTime;
	}
	public double getExcessFee() {
		return excessFee;
	}
}
