package testng2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo 
{
	
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("Login......",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		Reporter.log("Logout.....",true);
	}
	
	@Test(priority = 1,groups = {"user","smoke"})
	public void createUser()
	{
		Reporter.log("User Created.......",true);
	}
	
	@Test(priority = 2,groups = "user")
	public void EditUser()
	{
		Reporter.log("User Edited.......",true);
	}
	
	@Test(priority = 3,groups = "user")
	public void deleteUser()
	{
		Reporter.log("User Deleted.......",true);
	}

	@Test(priority = 4,groups = {"task","smoke"})
	public void createTask()
	{
		Reporter.log("Task Craeted",true);
	}
	
	@Test(priority = 5,groups = "task")
	public void editTask()
	{
		Reporter.log("Task Edited",true);
	}
	
	@Test(priority = 6,groups = "task")
	public void deleteTask()
	{
		Reporter.log("Task Deleted",true);
	}
	
}
