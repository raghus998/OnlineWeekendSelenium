package pom;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidValidLoginTest 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		//Create an object of Pom class (LoginPage)
		LoginPage lp = new LoginPage(driver);
		
		//Enter user NAme
		lp.enterUserName("admin");
		
		//Enter PW
		lp.enterPassword("damager");
				
		//Clcik on Login 
		lp.clickOnLogInBtn();
		
		Thread.sleep(2000);
		lp.enterUserName("Admin");
		lp.enterPassword("manager");
		lp.clickOnLogInBtn();		

		

}
}