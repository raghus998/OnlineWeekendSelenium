package testng2;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo7 
{
	@Test
	public void testA()
	{
		Reporter.log("Hi...",true);
		Assert.fail();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult res)
	{
		String name = res.getName();
		int status = res.getStatus();
		Reporter.log(name+"     "+status,true);
	}
	
	

}
