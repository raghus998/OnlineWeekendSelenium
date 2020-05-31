package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements
{
	static
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/12.handlingmultipleelement"+ "s.html");
		
		//To find all elemrnts with tag name = a
		List<WebElement> AllElements = driver.findElements(By.tagName("a"));
	
		//To get the size of WebElements
		int count = AllElements.size();
		System.out.println("No of WebElemrnts are : "+count);
		
		/*//To get the address of Webelements 
		for (WebElement ele : AllElements)
		{
		//To print text of WebEle
			String text = ele.getText();
			System.out.println(text);
			
		}*/
		
		//To get address of WB by using for loop
		for (int i = 0; i < count; i++) 
		{
			WebElement ele = AllElements.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
