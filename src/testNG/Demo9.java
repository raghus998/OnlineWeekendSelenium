package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo9 {
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before method",true);
	}
	
	@AfterMethod
	public void afterMethod()

	{
		Reporter.log("After method",true);
	}
	@Test
	public void testD()
	{
		Reporter.log("Hi",true);
	}
	
	@Test
	public void testE()
	{
		Reporter.log("Bye",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("GN",true);
	}

}
