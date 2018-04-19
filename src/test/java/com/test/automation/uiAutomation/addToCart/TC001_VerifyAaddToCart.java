package com.test.automation.uiAutomation.addToCart;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;
import com.test.automation.uiAutomation.uiActions.ProductDetailsPage;

public class TC001_VerifyAaddToCart extends TestBase{
	HomePage homepage;
	ProductDetailsPage productDetailsPage;
	
	@BeforeClass
	public void setUp() throws IOException {
      init(); 
      log.info("Before Class");
	}
	
	

	@Test
	public void TS001_verifyAaddToCart() {
		try {
			log.info("=======Starting TS001_verifyAaddToCart test========");
			homepage = new  HomePage(driver);
			homepage.clickOnMenulist();			
			/*homepage.switchToFrame();
			homepage.clickOnNavigationMenu(homepage.mens);
			homepage.clickOnProductInMensSection(homepage.jackets);
			productDetailsPage = new ProductDetailsPage(driver);
			productDetailsPage.selectProduct(productDetailsPage.contrast_jacket);
			homepage.switchToDefaultContent();*/
			log.info("=======Finished TS001_verifyAaddToCart test========");
			getScreenShot("verifyAaddToCart");
		} catch (Exception e) {
           getScreenShot("verifyAaddToCart");
		}
	}
	/*
	@Test
	public void TS002_verifyClickOnMenuList() {
		try {
			log.info("=======Starting TS002_verifyClickOnMenuList test========");
			homepage = new  HomePage(driver);
			homepage.clickOnMenulist();			
			log.info("=======Finished TS002_verifyClickOnMenuList test========");
			getScreenShot("verifyAaddToCart");
		} catch (Exception e) {
           getScreenShot("verifyAaddToCart");
		}
	}*/

	@AfterClass
	public void endTest() {
      closeBrowser();
      log.info("After Class");
	}

}
