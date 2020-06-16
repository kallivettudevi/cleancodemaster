package interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		Calculation obj=new Calculation();
		double compoundInterestOutput;
		compoundInterestOutput=obj.compoundInterest(1000,10,2,3);
		assertEquals(4095000.0,compoundInterestOutput,200.0);
	}

}
