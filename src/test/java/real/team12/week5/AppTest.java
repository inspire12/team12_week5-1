package real.team12.week5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import real.team12.week5.Calculator;


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
	@Test
	public void oneFamilyDiscountSilver(){
		int line = 4;
		c.init(2, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500, c.bill());
	}
	@Test
	public void basicSilverUseMinit(){
		int line = 1;
		int minit = 600;
		c.init(2, minit, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		c.excessFee(minit);
		assertEquals(2995+5400, c.bill());
	}
}
