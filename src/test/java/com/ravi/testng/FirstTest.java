package com.ravi.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	@Test
	public void TestGoogle() throws InterruptedException {
		System.out.println("Ravi");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		
		System.out.println(Driver.getTitle());
		Thread.sleep(4000);
		Driver.close();
		
			
	}
	@Test
	public void TestFacebook() throws InterruptedException {
		System.out.println("Ravi");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		String ActualValue = Driver.getTitle();
		String EspectedValue = "Facebook – log in or sign uppp";
		Assert.assertEquals(ActualValue, EspectedValue, "Title is Missmatch");
		
		System.out.println(Driver.getTitle());
		
		
		Thread.sleep(4000);
		Driver.close();
	
	}
	@Test
	public void LounchDriver() throws InterruptedException {
		System.out.println("Ravi");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
	}
}
