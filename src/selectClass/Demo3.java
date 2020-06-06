package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
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
		// To select all options
		for (int i = 0; i <= 4; i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);

		}

		/*// To deselect all options
		for (int i = 0; i <= 4; i++) {
			sel.deselectByIndex(i);
			Thread.sleep(1000);

		}*/
		
		//To deselect alloptions
		sel.deselectAll();
		
		//To check drop down is single select or multi select
		boolean result = sel.isMultiple();
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
