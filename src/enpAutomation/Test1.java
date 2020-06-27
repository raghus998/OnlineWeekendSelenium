package enpAutomation;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1
{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		//Create Login Class Object
		Login login = new Login(driver);
		
		//Enter user NAme
		login.enterUserName("Admin");
		
		//Enter PW
		login.enterPassword("damager");
		
		//Clcik on Login 
		login.clickOnLogInBtn();
		
		Thread.sleep(2000);
		login.enterUserName("Admin");
		login.enterPassword("manager");
		login.clickOnLogInBtn();

}
}