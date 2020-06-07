package act;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick
{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/js(doubleclick).html");
	    WebElement doubleClickEle = driver.findElement(By.id("b"));
	    
	    //Create a Actions Class
	    Actions act =new Actions(driver);
	    Thread.sleep(2000);
	    //To double Click of WEB ELE
	    act.doubleClick(doubleClickEle).perform();
	    Thread.sleep(2000);
	    WebElement WTQSP = driver.findElement(By.id("d"));
	    
	   System.out.println(WTQSP.getText());
	   
	   driver.close();
	
	
	
	
	
	
	
	
	}
}