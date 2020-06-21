package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	 {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Upcasting the driver object to TakeScreenshot(I)
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// to take the screensdhot of webpage
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//The location of Screenshot to store
		File dest = new File("./Screenshot/ABC.png");
		
		//To copy the Screenshot and paste in dest loc
		FileUtils.copyFile(src, dest);
		driver.close();
}
}