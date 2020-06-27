package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest
{
	
	@Test
	public void testA()
	{
		Reporter.log("TestA Method....",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("TestB Method....",true);
	}

}
