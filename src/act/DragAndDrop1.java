package act;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//Creat Actions Class
		Actions act = new Actions(driver);
		//WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//to switch to frame
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		//TO perform Drag and Drop
		act.clickAndHold(draggable).moveToElement(droppable).release().perform();
}
}