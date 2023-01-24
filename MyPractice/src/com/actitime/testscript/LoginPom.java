package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.Pom;

public class LoginPom extends BaseClass {
@Test
public void login() {
	WebDriver driver=new ChromeDriver();
	Pom p=new Pom(driver);
	p.setPom("admin","manager");
	driver.findElement(By.id("logoutLink")).click();
	p.setPom("admin1","manager1");

}
}
