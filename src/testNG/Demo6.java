package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 {
	@Test(priority = 1)
	public void UserCreate()
	{
		Reporter.log("User Created",true);
		Assert.fail();
	}
	
	
	@Test(priority = 2,dependsOnMethods = "UserCreate")
	public void UserDelete()
	{
		Reporter.log("User Deleted",true);
	}

}
