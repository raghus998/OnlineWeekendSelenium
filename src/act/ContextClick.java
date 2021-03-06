package act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));

		//Create a Actions Class
	    Actions act =new Actions(driver);
	    Thread.sleep(2000);
	    
	    //To perform context click
	    act.contextClick(link).perform();
	    
	    //To handle context menus (Robot claas in Java)
	    //Create an object of Robot class
	    Robot r  = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	   
	    Thread.sleep(5000);
	    
	    driver.close();
	
	
	
	
	
	
	
	}
}