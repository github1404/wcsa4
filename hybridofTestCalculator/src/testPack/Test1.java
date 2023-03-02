package testPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import pagePack.CalculatorPage;

public class Test1 extends BaseTest{
	
	@Test
	public void verifyMultiplication() throws InterruptedException {
		  
		
		CalculatorPage cp = new CalculatorPage(driver);
		
		 cp.multiplication();
		 
		 Reporter.log("it is verified",true);
	  }
	
	@Test(dependsOnMethods = "verifyMultiplication")
	public void verifyDivision() throws InterruptedException
	{
		CalculatorPage cp = new CalculatorPage(driver);
		cp.division();
		 Reporter.log("it is verified",true);
	}
	
	@Test(dependsOnMethods = "verifyMultiplication")
	public void verifyaddition() throws InterruptedException
	{
		CalculatorPage cp = new CalculatorPage(driver);
		cp.addition();
		 Reporter.log("it is verified",true);
	}

	@Test(dependsOnMethods = "verifyMultiplication")
	public void verifysubtraction() throws InterruptedException
	{
		CalculatorPage cp = new CalculatorPage(driver);
		cp.subtraction();
		 Reporter.log("it is verified",true);
	}



}
