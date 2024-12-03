package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	

	@Test
public void setup () {
		
		
	//	WebDriverManager.chromedriver().setup();
		
		
		
		
	//	System.setProperty("webdriver.chrome.driver","D:\\chromebrowser\\chromedriver.exe");
		
	//	ChromeOptions options = new ChromeOptions();
      // options.setBrowserVersion("120");
	
	        
		WebDriver driver = new ChromeDriver();
		driver.get("https://re-uat-trunk-qa.leaseaccelerator.com/pm/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}
}
