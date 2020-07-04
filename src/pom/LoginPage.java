package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	// Declaring WebElement
	@FindBy(id = "username")
	private WebElement un;

	@FindBy(name = "pwd")
	private WebElement pw;

	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	
	
	// initilization of webelement through Constrctor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	// Utlization through public method
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
