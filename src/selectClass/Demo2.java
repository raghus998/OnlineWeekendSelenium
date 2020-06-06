package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 
{
	static
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/selectclass.html");
		//To find dropdown
		WebElement hotel = driver.findElement(By.id("bhagini"));
		
		//crate a select clas to handle dropdown 
		Select sel = new Select(hotel);
		
		//To selct options
		sel.selectByIndex(4);
		sel.selectByValue("f");
		sel.selectByVisibleText(" Mutton");
		Thread.sleep(3000);
		//To deselect selected options (only multislect dropdown)
		//To deselect by index
		sel.deselectByIndex(4);
		Thread.sleep(3000);
		sel.deselectByValue("f");
		Thread.sleep(3000);
		sel.deselectByVisibleText("Mutton");
		
		
		
		
		
		
		
		
		
		
		
}
}