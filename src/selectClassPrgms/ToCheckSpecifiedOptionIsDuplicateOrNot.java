package selectClassPrgms;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckSpecifiedOptionIsDuplicateOrNot
{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		int count = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/14.selectclass.html");
		// find the drop down
		WebElement hotel = driver.findElement(By.id("bhagini"));


		// Create a Select Class to handle List box
		Select sel = new Select(hotel);

		// To get the Add of all options
		List<WebElement> alloptions = sel.getOptions();
		
		//Get text of each options
		for (WebElement option : alloptions)
		{
			String text = option.getText();
			if (text.equals(" prowns")) 
			{
				count++;
				
			}
			
		}
		
		if (count > 1) 
		{
			System.out.println("Specified Ele is duplicate");
		}
		else
		{
			System.out.println("Specified Ele  not is duplicate");
		}
		
		System.out.println("Specified Ele is duplicate   "+count+"  times");
		
	driver.close();

}}
