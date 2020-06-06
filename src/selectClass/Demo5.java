package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aparna/Downloads/Html/html%20files/selectclass.html");
		// To find dropdown
		WebElement hotel = driver.findElement(By.id("bhagini"));

		// crate a select clas to handle dropdown
		Select sel = new Select(hotel);
		
		
		sel.deselectByIndex(2);
		driver.close();

}}
