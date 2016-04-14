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
	
	private static final int GOLD =1;
	private static final int SILVER =2;
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
		
		int line = 1; 
		c.init(GOLD, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(4995+2150, c.bill());//
	}
	@Test
	public void oneLineAddedSilver(){
		int line = 2;
		c.init(SILVER, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(2995+1450, c.bill());
	}
	@Test
	public void twoLineAddedGold(){
		int line = 3;
		c.init(GOLD, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(4995+2900, c.bill());//
	}
	@Test
	public void twoLineAddedSilver(){
		int line = 3;
		c.init(SILVER, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(2995+4300, c.bill());
	}
	@Test
	public void oneFamilyDiscountGold(){
		int line = 4;
		int family =1;
		c.init(GOLD, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(4995+2900+500*family, c.bill());//
	}
	@Test
	public void oneFamilyDiscountSilver(){
		int line = 4;
		int family =1;
		c.init(SILVER, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500*family, c.bill());//
	}
	@Test
	public void threeFamilyDiscountGold(){
		int line = 6;
		int family =3;
		c.init(GOLD, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500*family, c.bill());
	}

	
	@Test
	public void threeFamilyDiscountSilver(){
		int line = 6;
		int family =3;
		c.init(SILVER, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500*family, c.bill());
	}
}
