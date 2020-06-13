package jse;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/18.javascript(disable).html");
		//driver.findElement(By.id("n")).sendKeys("RS");
		//Enter text 
		 String stmt = "document.getElementById('n').value='RS'";
		//Create a JSE(I)
		JavascriptExecutor js  = (JavascriptExecutor) driver;
		//to execute jS stmt
		js.executeScript(stmt);
		
		//To clear text
		Thread.sleep(3000);
		 String stmt1 = "document.getElementById('n').value=' '";
		 js.executeScript(stmt1);
	
	
	
	
	}
}