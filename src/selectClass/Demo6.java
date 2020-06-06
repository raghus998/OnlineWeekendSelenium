package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6
{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/selectclass.html");
		// To find dropdown
		WebElement hotel = driver.findElement(By.id("bhagini"));

		// crate a select clas to handle dropdown
		Select sel = new Select(hotel);
		
		//Select options
		sel.selectByIndex(2);
		//sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(1);
		
		//To gey the only selected options text
	List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
	
	//to print all selected options
	for (WebElement option : allSelectedOptions) 
	{
		String text = option.getText();
		System.out.println(text);
		
	}
	
		
		driver.close();
		
		
		
		
		
		

}
}