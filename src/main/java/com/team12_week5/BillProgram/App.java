package com.team12_week5.BillProgram;

/**
 * Hello world!
 * test
 */
public class App 
{
	private App(){
		
	}
	public static int OneLineAddedGold(){
		Calculator c = new Calculator(1, 0, 2);
		c.basicFee();
		c.additinalFee();
		return c.bill();
	}
    public static void main( String[] args )
    {
    	System.out.println(OneLineAddedGold());
    }
}
