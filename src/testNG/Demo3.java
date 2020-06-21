package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void testD()
	{
		Reporter.log("Hi",true);
	}
	
	@Test
	public void testE()
	{
		Reporter.log("Bye",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("GN",true);
	}

}
