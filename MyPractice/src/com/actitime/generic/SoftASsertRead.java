package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftASsertRead {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void Verify()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String eTitle = "Google";
		String aTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(eTitle, aTitle);
		driver.close();
		s.assertAll();
	}

}
