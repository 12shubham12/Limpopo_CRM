package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.CRM.pages.BaseClass;
import com.CRM.pages.LoginPage;

public class LoginTestCRM extends BaseClass{
	
	@Test(priority=1)
	public void loginApp(){		
		logger = report.createTest("Login to CRM");
	//Use Pagefactory class to initialize the page using initElements method
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		/* We are achieving abstraction by using the line loginPage.loginToCRM(“shuraj93@gmail.com”,”asd”);
		Coz we are just showing the essential features and hiding the background details
		(like what locators we have used, what strategy we have used)*/
		///loginPage.loginToFacebook("shuraj93@gmail.com", "asd");
		
		logger.info("Starting Application");
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		logger.pass("Login success");
				}

}