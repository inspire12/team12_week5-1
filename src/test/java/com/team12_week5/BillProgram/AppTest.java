package com.team12_week5.BillProgram;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Calculator c = new Calculator();
	@Test
	public void simpleGold(){
		c.init(1,0,1);
		c.basicFee();
		assertEquals(4995, c.bill());
	}
	@Test
	public void simpleSilver(){
		c.init(2, 0, 1);
		c.basicFee();
		assertEquals(2995, c.bill());
	}
	@Test
	public void oneLineAddedGold(){
		int line = 2;
		c.init(1, 0, line);
		c.basicFee();
		c.additinalFee(2);
		assertEquals(4995+1450, 0);
	}
	@Test
	public void manyLineAddedSilver(){
		int line = 3;
		c.init(2, 0, line);
		c.basicFee();
		c.additinalFee(3);
		assertEquals(2995+2150, 0);
	}
}
