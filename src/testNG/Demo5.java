package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5
{
	 
		@Test(priority = 1)
		public void UserCreate()
		{
			Reporter.log("User Created",true);
			//Assert.fail();
		}
			
		@Test(priority = 2)
		public void UserEdit()
		{
			Reporter.log("User Edited",true);
			Assert.fail();
		} 
		
		
		@Test(priority = 3,dependsOnMethods = {"UserCreate","UserEdit"})
		public void UserDelete()
		{
			Reporter.log("User Deleted",true);
		}

}
