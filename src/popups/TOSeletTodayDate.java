package popups;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOSeletTodayDate {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(5000);
		
		//To get Today's date
		Date date = new Date();
		
		//To get today date in required format
		SimpleDateFormat s1 = new SimpleDateFormat("d");
		String day = s1.format(date);
		System.out.println(day);
		
		//To get current month  in required format
		SimpleDateFormat s2 = new SimpleDateFormat("MMMM");
		String month = s2.format(date);
		System.out.println(month);
		
		String departDate = "//span[.='"+month+"']/../../..//a[.='"+day+"']";
		driver.findElement(By.xpath(departDate)).click();
		Thread.sleep(5000);
		driver.close();
		
		

}
}