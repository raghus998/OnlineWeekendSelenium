package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
	}

}
