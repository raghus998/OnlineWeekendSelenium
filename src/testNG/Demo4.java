package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 
{
	 final int p = 1;
	@Test(priority = p)
	public void UserCreate()
	{
		Reporter.log("User Created",true);
	}
	
	@Test(priority = 2)
	public void UserEdit()
	{
		Reporter.log("User Edited",true);
	}
	
	@Test(priority = 3)
	public void UserDelete()
	{
		Reporter.log("User Deleted",true);
	}

}
