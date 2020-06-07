package selectClassPrgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsInSortedOrder 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/14.selectclass.html");
		//find tje drop down
		WebElement hotel = driver.findElement(By.id("bhagini"));
		
		//Create empty ArrayList (alloptionsCopy)
		ArrayList<String> alloptionsCopy = new ArrayList<>();
		
		//Create a Select Class to handle List box
		Select sel = new Select(hotel);
		
		//To get the Add of all options
		List<WebElement> alloptions = sel.getOptions();
		
		//get alloptions without sort
		for (WebElement option : alloptions)
		{
			String text = option.getText();
			alloptionsCopy.add(text);
		}
		
		System.out.println("Before Sorting : "+alloptionsCopy);
		
		//sort the alloptions
		Collections.sort(alloptionsCopy);
		
		// print sorted list
		for (String option : alloptionsCopy) 
		{
			System.out.println(option);
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
