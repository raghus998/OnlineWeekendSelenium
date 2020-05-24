package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.hackerrank.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

}
}