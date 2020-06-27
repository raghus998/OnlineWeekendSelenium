package testng2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo5 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void testA()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String eTitle = "actiTIME - Login123";
		String aTitle = driver.getTitle();
		
		//To verify the TestClass o/p or Verification of Expected O/P
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aTitle, eTitle);
		Reporter.log("Pass",true);
		driver.close();
		//to give the correct result and should final line of testMethod
		sa.assertAll();
	}

}
