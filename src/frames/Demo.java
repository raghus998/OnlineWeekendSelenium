package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/16.frames.iframe/page1.html");
		driver.findElement(By.id("m")).sendKeys("RS");
		driver.findElement(By.id("gf1")).sendKeys("XYZ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}