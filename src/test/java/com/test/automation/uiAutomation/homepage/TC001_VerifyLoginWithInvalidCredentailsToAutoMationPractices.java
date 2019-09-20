package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;
import com.test.automation.uiAutomation.uiActions.HomePage_AutomationPractices;
import com.test.automation.uiAutomation.uiActions.LoginPage;

public class TC001_VerifyLoginWithInvalidCredentailsToAutoMationPractices extends TestBase{
	
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentailsToAutoMationPractices.class.getName());	

	HomePage homepage;
	LoginPage login;
	
	@BeforeClass
	public void setUp() throws IOException{
   //  init();
	}	
	
	@Test(priority=1)
	public void verifyLoginWithStudent(){
		log.info("=========== Starting verifyLoginWithInvalidCredentails Test=============");
		login = new LoginPage(driver);
		boolean loginsuccess = login.studentLogin(OR.getProperty("userName"),OR.getProperty("password"));		
		Assert.assertEquals(loginsuccess, true, "Login is not successfully");
		homepage = new HomePage(driver);
		boolean readingreport = homepage.readingHomePage();
		Assert.assertEquals(readingreport, true, "Reading report is not displayed");		
		log.info("=========== Finished verifyLoginWithInvalidCredentails Test=============");
		getScreenShot("Roshan 1");
	}	
	

	@Test(priority=2)
	public void verifyLoginWithStudenttt(){
		log.info("=========== Starting verifyLoginWithInvalidCredentails Test=============");
		login = new LoginPage(driver);
		boolean loginsuccess = login.studentLogin(OR.getProperty("userName"),OR.getProperty("password"));		
		Assert.assertEquals(loginsuccess, true, "Login is not successfully");
		homepage = new HomePage(driver);
		boolean readingreport = homepage.readingHomePage();
		Assert.assertEquals(readingreport, true, "Reading report is not displayed");		
		log.info("=========== Finished verifyLoginWithInvalidCredentails Test=============");
		getScreenShot("Roshan 2");
	}	
	
//	@AfterClass
//	public void endTest(){
//		driver.close();
//	}

}
