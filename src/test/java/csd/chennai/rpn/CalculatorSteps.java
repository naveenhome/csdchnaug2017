package csd.chennai.rpn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.TestCase;

public class CalculatorSteps extends TestCase{
	String expr;
	@Given("^user enter \"([^\"]*)\" in RPN Calc$")
	public void user_enter_in_RPN_Calc(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		expr = arg1;
	}

	@Then("^RPN should display \"([^\"]*)\"$")
	public void rpn_should_display(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		RPNCalculator calc = new RPNCalculator();
		int result = Integer.valueOf(arg1);
		assertEquals(result,calc.Calculate(expr)); 
	}

}
