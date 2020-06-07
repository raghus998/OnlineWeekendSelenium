package selectClassPrgms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsWithoutDuplicateAndInSortedOrder {
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

		// Create the TreeSet Object
		TreeSet<String> ts = new TreeSet<>();

		// Create a Select Class to handle List box
		Select sel = new Select(hotel);

		// To get the Add of all options
		List<WebElement> alloptions = sel.getOptions();
		
		//Get the Text of options and store in TreeSet
		for (WebElement option : alloptions)
		{
			String text = option.getText();
			ts.add(text);
		}
		
		//Print Treeset
		for (String text : ts) {
			System.out.println(text);
			
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}