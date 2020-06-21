package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void testB()
	{
		Reporter.log("Bye",true);
	}

}
