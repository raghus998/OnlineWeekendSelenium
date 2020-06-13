package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String scrollup = "window.scrollBy(0,1000)";
		js.executeScript(scrollup);
		Thread.sleep(3000);
		String scrolldown= "window.scrollBy(0,-500)";
		js.executeScript(scrolldown);
}
}