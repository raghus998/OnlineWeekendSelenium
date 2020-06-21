package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo8 
{
	@Test(priority = 1,invocationCount = 10)
	public void UserCreate()
	{
		Reporter.log("User Created",true);
	}
	
	

}
