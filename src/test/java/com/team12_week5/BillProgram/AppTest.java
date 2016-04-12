package com.team12_week5.BillProgram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private Calculator c;
	@Before
	public void setUp(){
		c = new Calculator();
	}
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
		c.additinalFee(line);
		assertEquals(4995+1450, c.bill());
	}
	@Test
	public void twoLineAddedSilver(){
		int line = 3;
		c.init(2, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(2995+4300, c.bill());
	}
}
