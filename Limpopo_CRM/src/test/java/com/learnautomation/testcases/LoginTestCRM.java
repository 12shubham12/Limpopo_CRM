package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.CRM.pages.BaseClass;
import com.CRM.pages.LoginPage;

//below we used extends keyword, to achieve inheritance
public class LoginTestCRM extends BaseClass{
	
	@Test(priority=1)
	public void loginApp(){		
		logger = report.createTest("Login to CRM");
		
       /*Use Pagefactory class to initialize the page using initElements method, which initialize all the locator of that page
		and will return object of same class, as from below, for LoginPage class, loginPage object is returned.*/
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
/*Note from all the codes above, we are achieving abstraction, coz we are just showing the essential 
 * features and hiding the details */
