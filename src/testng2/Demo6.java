package testng2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 {

	@Test
	public void testA()
	{
		Reporter.log("PAss",true);
		//Fail the Test method
		Assert.fail();
	}
}
