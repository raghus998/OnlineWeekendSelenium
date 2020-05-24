package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleMetod1 
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files(raj)/webelements1.html");
		driver.manage().window().maximize();
		WebElement fbLink = driver.findElement(By.xpath("//a[text()='facebook']"));
		//To get text of WE
		String text = fbLink.getText();
		System.out.println("Text : "+text);
		//Toget tag name
		String tagName = fbLink.getTagName();
		System.out.println("Tagname : "+tagName);
		//to get size of WE
		Dimension size = fbLink.getSize();
		System.out.println(size);
		int h = size.getHeight();
		int w = size.getWidth();
		System.out.println("Hiegt is : "+h);
		System.out.println("Width is : "+w);
		
		//to get location of WB
		Point loc = fbLink.getLocation();
		System.out.println("Location : "+loc);
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("x axis : "+x);
		System.out.println("Y axis : "+y);
		
		//to get the attribute value
	  String href = fbLink.getAttribute("href");
	  System.err.println(href);
	  //To get css vlues
	  String color = fbLink.getCssValue("color");
	  System.out.println(color);
	
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
}
}