package selectClassPrgms;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptinsWithoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/14.selectclass.html");
		// find the drop down
		WebElement hotel = driver.findElement(By.id("bhagini"));

		// Create the HashSet Object
		HashSet<String> hs = new HashSet<>();

		// Create a Select Class to handle List box
		Select sel = new Select(hotel);

		// To get the Add of all options
		List<WebElement> alloptions = sel.getOptions();
		
		//get the count of allptions
		int count = alloptions.size();
		System.out.println("Total no of options are :"+count);
		
		//Get the text of options and store in HashSet
		for (int i = 0; i <count; i++)
		{
			WebElement option = alloptions.get(i);
			String text = option.getText();
			hs.add(text);
		}
		
		//Print the Hashset
		for (String text  : hs)
		{
			System.out.println(text);
		}
		
		driver.close();
		
		
		
		
		
		
		
		

	}
}