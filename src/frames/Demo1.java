package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/17.frames%202%20eg/page1.html");
		driver.findElement(By.id("m")).sendKeys("RS");
		
		//To swwitch to frame by using name
		driver.switchTo().frame("frame");
		
		driver.findElement(By.id("gf1")).sendKeys("ABC");
		
		//To switch for frame present inside page 2
		WebElement page3 = driver.findElement(By.xpath("//iframe[@src='page3.html']"));
		driver.switchTo().frame(page3);
		
		driver.findElement(By.id("s")).sendKeys("ASis");
		
		//to switch back to parent frame
		//driver.switchTo().parentFrame();
		//driver.findElement(By.id("gf1")).clear();
		
		//To switch back to default content
		driver.switchTo().defaultContent();
		driver.findElement(By.id("gf2")).sendKeys("XYb");
	
	
	
	}
}