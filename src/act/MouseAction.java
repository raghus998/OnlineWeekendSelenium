package act;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/results/by-the-numbers/");
		
		//Create a Actions Class 
		Actions act = new Actions(driver);
		
		WebElement sol = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		
		//To move the cursor to Sol WE
		act.moveToElement(sol).perform();
		Thread.sleep(3000);
		//To click on Problems we Solve
		driver.findElement(By.xpath("//a[.='Problems We Solve']")).click();
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}