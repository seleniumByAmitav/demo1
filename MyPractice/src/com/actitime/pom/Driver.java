package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Pom p=new Pom(driver);
		p.setPom("admin","manager");
		Thread.sleep(1000);
		driver.findElement(By.id("logoutLink")).click();
		p.setPom("admin1","manager1");

	}

}
