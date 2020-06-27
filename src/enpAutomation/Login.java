package enpAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
	//Declaring Variable as Private
	private WebElement un;
	private WebElement pw;
	private WebElement loginBtn;
	
	///initilization  through Constrctor
	public Login(WebDriver driver) 
	{
		this.un = driver.findElement(By.id("username"));
		this.pw = driver.findElement(By.name("pwd"));
		this.loginBtn = driver.findElement(By.id("loginButton"));
	}
	
	//Utlization through public method
	public void enterUserName(String userName) 
	{
		un.sendKeys(userName);
	}
	
	public void enterPassword(String password) 
	{
		pw.sendKeys(password);
	}
	
	public void clickOnLogInBtn() 
	{
		loginBtn.click();
		
	}

}
