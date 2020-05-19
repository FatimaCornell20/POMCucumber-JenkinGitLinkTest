package com.qa.stepDefininations;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	
	LoginPage loginpage; 
	HomePage homePage; 

	
	@Given("^user opens the browser$")
	public void user_opens_the_browser()  {
		TestBase.initialization(); 
		
	}

	@Then("^user is on loginPage$")
	public void user_is_on_loginPage() throws Throwable {
	 loginpage=new LoginPage(); 
	 String title=loginpage.validateLoginPageTitle(); 
	 Assert.assertEquals("Cogmento CRM", title);
		
	}

	@Then("^user logs into app$")
	public void user_enters_email_and_password() throws Throwable {
	homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	String homeTitle=homePage.validateTitlePage();
	Assert.assertEquals("Cogmento CRM",homeTitle);
	}

	@Then("^validate correct user name$")
	public void validate_home_page_title() throws Throwable {
	boolean username=homePage.validateCorrectusername(); 
	Assert.assertTrue(username); 
	
	}


	@Then("^click on home link$")
	public void click_on_home_link() throws Throwable {
	 homePage.ClickonHomeLink();
	 
	}


	
	
	
}
