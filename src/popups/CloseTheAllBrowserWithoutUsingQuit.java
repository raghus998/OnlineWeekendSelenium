package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheAllBrowserWithoutUsingQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		
		//get the address of all browser
		Set<String> allBrowser = driver.getWindowHandles();
		
		for (String add : allBrowser) 
		{
			//To switch to each browser
			driver.switchTo().window(add);
			driver.close();
			Thread.sleep(2000);
		}
}
}