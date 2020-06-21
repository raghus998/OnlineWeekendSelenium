package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowse2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		
		//To get address of parent window
		String parentadd = driver.getWindowHandle();
		System.out.println(parentadd);
		
		//To get add of all window
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("Addres of all window : ");
		for (String add : allwindow) 
		{
			System.out.println(add);
			
		}

}
}