package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleMethods
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files(raj)/webelements1.html");
		driver.manage().window().maximize();
		WebElement fn = driver.findElement((By.id("fn")));
		fn.sendKeys("RS");
		WebElement fbLink = driver.findElement(By.xpath("//a[text()='facebook']"));
		//fbLink.click();
		fbLink.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	 }
}
