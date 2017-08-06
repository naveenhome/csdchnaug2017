package csd.chennai.rpn;

import junit.framework.TestCase;

public class TestRPNCalculator extends TestCase{

	public void testCase1()
	{
		String expr = "2,2,+";
		RPNCalculator calc = new RPNCalculator();
		assertEquals(4,calc.Calculate(expr)); 
	}
	public void testCase2()
	{
		String expr = "2,3,+";
		RPNCalculator calc = new RPNCalculator();
		assertEquals(5,calc.Calculate(expr)); 
	}
}
