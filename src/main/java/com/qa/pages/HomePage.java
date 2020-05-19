package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	//Page Factory -OR: 
		@FindBy(xpath="//span[@class='user-display']")
		WebElement username; 
		
		@FindBy(xpath="//span[text()='Home']")
		WebElement homelink;
		
//		@FindBy(xpath="//a[text()='Forgot your password?']")
//		WebElement forgotPass; 
		
		//Initializing all the page objects we need this initialization 
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions 
		public String validateTitlePage() {
			return driver.getTitle();
			
		}
		public boolean validateCorrectusername() {
			return username.isDisplayed();
			
		}
		public void ClickonHomeLink() {
			Actions action= new Actions(driver); 
			action.moveToElement(homelink).build().perform();
			
			
		}
}
