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
	
	final int gold =1;
	final int silver =2;
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
		c.init(gold, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(4995+2150, c.bill());//
	}
	@Test
	public void oneLineAddedSilver(){
		int line = 2;
		c.init(silver, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(2995+1450, c.bill());
	}
	@Test
	public void twoLineAddedGold(){
		int line = 3;
		c.init(gold, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(4995+2900, c.bill());//
	}
	@Test
	public void twoLineAddedSilver(){
		int line = 3;
		c.init(silver, 0, line);
		c.basicFee();
		c.additinalFee(line);
		assertEquals(2995+4300, c.bill());
	}
	@Test
	public void oneFamilyDiscountGold(){
		int line = 4;
		int family =1;
		c.init(gold, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(4995+2900+500*family, c.bill());//
	}
	@Test
	public void oneFamilyDiscountSilver(){
		int line = 4;
		int family =1;
		c.init(silver, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500*family, c.bill());//
	}
	@Test
	public void threeFamilyDiscountGold(){
		int line = 6;
		int family =3;
		c.init(gold, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500*family, c.bill());
	}

	
	@Test
	public void threeFamilyDiscountSilver(){
		int line = 6;
		int family =3;
		c.init(silver, 0, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		assertEquals(2995+4300+500*family, c.bill());
	}
	
	@Test
	public void basicGoldUseMinit(){
		int line = 1;
		int minit = 600;
		c.init(gold, minit, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		c.excessFee(minit);
		assertEquals(4995+0, c.bill());
	}
	@Test
	public void basicSilverUseMinit(){
		int line = 1;
		int minit = 600;
		c.init(silver, minit, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		c.excessFee(minit);
		assertEquals(2995+5400, c.bill());
	}
	@Test
	public void basicGoldUseMinit(){
		int line = 1;
		int minit = 1600;
		c.init(gold, minit, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		c.excessFee(minit);
		assertEquals(4995+(minit-1000)*45, c.bill());
	}
	@Test
	public void basicSilverUseMinit(){
		int line = 1;
		int minit = 1600;
		c.init(silver, minit, line);
		c.basicFee();
		c.additinalFee(line);
		c.familyDiscont(line);
		c.excessFee(minit);
		assertEquals(2995+(minit-500)*54, c.bill());
	}
	
	
	
}
