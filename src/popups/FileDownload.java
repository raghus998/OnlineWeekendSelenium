package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Thread.sleep(3000);
		
		//By using Robot class hadle File Download Popup
		Robot r = new Robot();
		
		//To bring Conrol to Save btn
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(3000);
		//To Click on Save Btn
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
		

}
}