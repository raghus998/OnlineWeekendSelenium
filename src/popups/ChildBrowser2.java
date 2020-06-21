package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {
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
		System.out.println(allBrowser.size());
		//get the address of main window
		String parent = driver.getWindowHandle();
		
		//to remove address of parent window from allbowser
		allBrowser.remove(parent);
		System.out.println(allBrowser.size());
		
		for (String add : allBrowser) 
		{
			driver.switchTo().window(add);
			driver.close();
			
		}
		
		
}
}