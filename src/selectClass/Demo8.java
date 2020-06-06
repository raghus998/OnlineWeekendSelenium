package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 
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
		
		
		//To get address of all options
		List<WebElement> allOptions = sel.getOptions();
		
		//To get count
		int count = allOptions.size();
		System.out.println("No of options are :"+count);
		
		
		for (int i = 0; i < count; i++)
		{
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
			
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}