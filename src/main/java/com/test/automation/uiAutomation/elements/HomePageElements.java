/**
 * 
 */
package com.test.automation.uiAutomation.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.uiAutomation.testBase.TestBase;

/**
 * @author roshan_mankani
 *
 */
public class HomePageElements extends TestBase {
	
	
	
	@FindBy(xpath="//a[@href='https://]")
	public WebElement reading_report;
	
	@FindBy(xpath="//a[@href='72']")
	public WebElement math_report;	
	
	

	
	

}
