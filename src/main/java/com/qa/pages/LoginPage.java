package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class LoginPage extends TestBase {

	//Page Factory -OR: 
	@FindBy(name="email")
	WebElement email; 
	
	@FindBy(name="password")
	WebElement password; 
	
	@FindBy(name="username")
	WebElement username; 
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn; 
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpBtn; 
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotPass; 
	
	//Initializing all the page objects we need this initialization 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions 
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	public boolean validateForgotPassLink() {
		return forgotPass.isDisplayed();
		
	}
	public HomePage login(String em, String pwd) {
	email.sendKeys(prop.getProperty("email"));	
	password.sendKeys(prop.getProperty("password"));
	//loginBtn.click();
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("arguments[0].click();", loginBtn); 
	
	return new HomePage(); 
	
	}
}
