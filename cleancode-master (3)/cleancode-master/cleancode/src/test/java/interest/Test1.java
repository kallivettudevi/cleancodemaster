package interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		Calculation obj=new Calculation();
		float simpleInterestOutput ;
		simpleInterestOutput=obj.simpleInterest(1000,10,2);
		assertEquals(200.0,simpleInterestOutput,200.0);
		simpleInterestOutput=obj.simpleInterest(1240,30,5);
		assertEquals(1860.0,simpleInterestOutput,1860.0);
		
		
	}

}
