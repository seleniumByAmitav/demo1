package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void verify()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String eTitle = "Google";
		String aTitle = driver.getTitle();
		if(eTitle.equals(aTitle))
		{
			System.out.println("Title matching");
		}
		else
		{
			System.out.println("Title not matching");
		}
		driver.close();
	}

}
