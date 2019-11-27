package com.CRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//declare the locator - In pageObjet, it�s good practice to use @FindBy
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		this.driver=ldriver;
	}
	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement paswd;
	@FindBy(xpath="//button[@class='button buttonBlue' and @type='submit']") WebElement loginButton;
	
	//create methods for each locator
	
	public void loginToCRM(String usernameApplication, String passwordApplication){
		uname.sendKeys(usernameApplication);
		paswd.sendKeys(passwordApplication);
		loginButton.click();
	}
}
