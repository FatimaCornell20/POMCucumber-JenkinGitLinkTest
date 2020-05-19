package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop; 
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("/Users/fatima/Desktop/Reza/JAVA/POMCucumber/src/main/java/com/qa/config/config.properties");
			prop.load(ip);//4.load all the properties class obj and it leads to second catch clause 
		} catch (FileNotFoundException e) {
		System.out.println("some issues with config properties.. please correct your config..");
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void initialization(){

		String browserName=prop.getProperty("browser"); 
			  
 	if(browserName.equals("chrome")) {
		//WebDriverManager.chromedriver().setup(); 
		System.setProperty("webdriver.chrome.driver", "//Users//fatima//Documents//chromedriver");  
		driver=new ChromeDriver(); 
 	}
 	else if(browserName.equals("FF")) {
		//WebDriverManager.chromedriver().setup(); 
		System.setProperty("webdriver.gecko.driver", "//Users//fatima//Documents//chromedriver");  
		driver=new ChromeDriver();
		}
		
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); 
	  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			   			  
      driver.get(prop.getProperty("url")); 
	
	}
	
	
}

