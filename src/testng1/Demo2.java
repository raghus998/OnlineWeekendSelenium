package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2  extends BaseTest
{

	
	@Test
	public void testC()
	{
		Reporter.log("TestC Method....",true);
	}
}
