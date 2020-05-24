package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//Dimension d = new Dimension(50, 50);
		//driver.manage().window().setSize(d);
		//Point p = new Point(50, 150);
		//driver.manage().window().setPosition(p);
		driver.get("https://www.hackerrank.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSrc = driver.getPageSource();
		System.out.println(pageSrc);
		Thread.sleep(3000);
		driver.close();

}
	}
