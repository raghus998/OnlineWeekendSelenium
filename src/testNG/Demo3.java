package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void UserCreate()
	{
		Reporter.log("User Created",true);
	}
	
	@Test
	public void UserEdit()
	{
		Reporter.log("User Edited",true);
	}
	
	@Test
	public void UserDelete()
	{
		Reporter.log("User Deleted",true);
	}

}
