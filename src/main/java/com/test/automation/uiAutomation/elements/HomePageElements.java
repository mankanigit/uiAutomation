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
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li/a")
	public List<WebElement> menutab;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public WebElement signIn;
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement loginEmailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	public WebElement loginPassword;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitButton;
	
	@FindBy(xpath="//*[@id='center_column']/div[1]/ol/li")
	public WebElement authenticationFailed;
	
	@FindBy(id="PreviewFrame")
	public WebElement homePageIframe;
	
	@FindBy(id="customer_register_link")
	public WebElement signUpLink;
	
	@FindBy(id="FirstName")
	public WebElement firstName;
	
	@FindBy(id="LastName")
	public WebElement lastName;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="CreatePassword")
	public WebElement createPassword;
	
	@FindBy(css="input.btn")
	public WebElement createAccount;
	
	@FindBy(xpath="//*[@id='shopify-section-header']/div/div[2]/span")
	public WebElement registrationMessage;
	
	@FindBy(xpath="//*[@id='customer_login_link']")
	public WebElement loginLink;
	
	@FindBy(id="CustomerEmail")
	public WebElement loginEmail;
	
	@FindBy(xpath=".//*[@id='CustomerPassword']")
	public WebElement password;
	
	@FindBy(xpath=".//*[@id='customer_login']/p[1]/input")
	public WebElement clickOnSignIn;
	
	@FindBy(xpath="//*[@id='customer_logout_link']")
	public WebElement logout;
	

}
