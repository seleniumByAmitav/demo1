package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom  {
	@FindBy(id="username")
	private WebElement unbx;
	@FindBy(name="pwd")
	private WebElement pwbx;
	@FindBy(xpath="//div[text()='Login '] ")
	private WebElement logbtn;
	public Pom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setPom(String un,String pw) {
		unbx.sendKeys(un);
		pwbx.sendKeys(pw);
		logbtn.click();
	}
	
}
