package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleMetod2
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement fradioBtn = driver.findElement(By.id("u_0_6"));
		//to check WE is dispalyed ot not
		boolean disstatus = fradioBtn.isDisplayed();
		System.out.println(disstatus);
		//to check WE is  enabled or not
		boolean enststus = fradioBtn.isEnabled();
		System.out.println(enststus);
		//to check Wb is selected or not
		boolean seleStatus = fradioBtn.isSelected();
		System.out.println(seleStatus);
		Thread.sleep(2000);
		fradioBtn.click();
		Thread.sleep(5000);
		boolean seleStatus1 = fradioBtn.isSelected();
		System.out.println(seleStatus1);
		driver.close();

}
}