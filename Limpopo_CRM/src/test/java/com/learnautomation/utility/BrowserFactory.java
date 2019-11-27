package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL){
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else{
			System.out.println("We do not support this browser");	
		}
		//after else statement write below code for launching the url
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	//code for quitting the browser
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}
}	