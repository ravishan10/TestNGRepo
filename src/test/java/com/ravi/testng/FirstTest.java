package com.ravi.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	@Test
	void first() throws InterruptedException {
		System.out.println("Ravi");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		
		System.out.println(Driver.getTitle());
		Thread.sleep(4000);
		Driver.close();
		
			
	}

}
