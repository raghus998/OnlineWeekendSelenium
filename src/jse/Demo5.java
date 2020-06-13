package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for (int i = 0; i < 15; i++)
		{
			String scroll = "window.scrollBy(0,100)";
			js.executeScript(scroll);
			Thread.sleep(1000);
			
		}
		
}
}