package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 {
	 
		@Test(priority = 1)
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
