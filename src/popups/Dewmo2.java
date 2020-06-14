package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dewmo2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/java%20script%20pop%20up/prompt.html");
		WebElement tryitBtn = driver.findElement(By.xpath("//button[.='Try it']"));
		tryitBtn.click();
		
		Thread.sleep(2000);
		
		//To switch to Alert
		Alert alert = driver.switchTo().alert();
		
		//To enter text in input field
		alert.sendKeys("RS");
		
		Thread.sleep(2000);
		
		//To click pon OK btn
		alert.accept();
		
		
		//To print the Msg
		String msg = driver.findElement(By.id("demo")).getText();
		System.out.println(msg);
		
		driver.close();
		
	}
}