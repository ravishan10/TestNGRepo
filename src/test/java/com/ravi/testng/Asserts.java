package com.ravi.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserts {
	@Test
	
	public void testassert() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String ExpectedValue = driver.getTitle();
		String ActualValue = "Log in to Facebook";
		//Hard Assertion once it's failed it will stop the rest of the execution.		
		Assert.assertEquals(ActualValue,ExpectedValue);
		driver.close();
				
		}
	@Test
	public void softAsst() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9559552134", Keys.ENTER);
		Thread.sleep(2000);
		//Soft Assertion method
		SoftAssert softAssert = new SoftAssert();
		
		//Title Assertion
		
		String ExpectedTitle = "Log in to Facebook";
		String ActualTitle = driver.getTitle();
		softAssert.assertEquals(ActualTitle, ExpectedTitle);
		
		//URL Assertion
		
		String ExpectedURL = "https://www.facebook.com/";
		String ActualURL = driver.getCurrentUrl();
		softAssert.assertEquals(ActualURL, ExpectedURL);
		
		//Text Assertion
		
		String ActualText = driver.findElement(By.id("email")).getAttribute("value");
		String ExpectedText = "";
		softAssert.assertEquals(ActualText, ExpectedText);
		
		//Error Assertion
		
		String ActualErrorMessage = driver.findElement(By.xpath("//div[@class='clearfix _5466 _44mg']/div[2]")).getText();
		String ExpectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";
		softAssert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);
		
		driver.quit();
		softAssert.assertAll();
		
	}
}
