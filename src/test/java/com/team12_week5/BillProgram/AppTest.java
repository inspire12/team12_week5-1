package com.team12_week5.BillProgram;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void simpleGold(){
		Calculator c = new Calculator(1, 0, 1);
		c.basicFee();
		assertEquals(4995, c.bill());
	}
	@Test
	public void simpleSilver(){
		Calculator c = new Calculator(2, 0, 1);
		c.basicFee();
		assertEquals(2995, c.bill());
	}
	public void OneLineAddedGold(){
		Calculator c = new Calculator(1, 0, 2);
		c.basicFee();
		c.additinalFee();
		assertEquals(4995+1450, 0);
	}
}
