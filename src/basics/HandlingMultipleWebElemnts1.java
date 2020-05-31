package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElemnts1
{
	static
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//To get add of All WE which is having tahName = a
		List<WebElement> allWebElements = driver.findElements(By.tagName("a"));
		
		//To get the no of Webelemets
		int count = allWebElements.size();
		System.out.println("No of WebElements on Webpage is :"+count);
		
		//To print the webElemrn text
		for (int i = 0; i <count; i++)
		{
			WebElement ele = allWebElements.get(i);
			String text = ele.getText();
			String href = ele.getAttribute("href");
			System.out.println("WebElement text is :"+text+"   WebElement href value is :"+href);
			
		}
		
driver.close();
}
}