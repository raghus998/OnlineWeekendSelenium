package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

static
{
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("C:\\Users\\Aparna\\Downloads\\Html\\html files\\selectclass.html");
	//Find the List box
	WebElement hotel = driver.findElement(By.id("bhagini"));
	//To handle List box create Select class Object
	Select sel = new Select(hotel);
	Thread.sleep(3000);
	/*//To select by using index
	sel.selectByIndex(2);*/
	
	/*//To select by Value
	sel.selectByValue("f");*/
	
	/*//To select by using visible text
	sel.selectByVisibleText(" prowns");*/
	
	/*//To select by Value
	sel.selectByValue("p");
	Thread.sleep(5000);*/
	
	
	//To select by using index
	sel.selectByIndex(4);
	
	//To deselct selected option 
	//sel.deselectByIndex(4);
	
	//To check drop down is single select or multi select
	boolean result = sel.isMultiple();
	System.out.println(result);
			
	driver.close();
	
	


}
}