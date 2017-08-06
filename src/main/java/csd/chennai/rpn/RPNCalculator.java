package csd.chennai.rpn;

public class RPNCalculator {
	public int Calculate(String expr)
	{
		String [] input = expr.split(",");
		return Integer.parseInt(input[0])+ Integer.parseInt(input[1]);
	}

}
