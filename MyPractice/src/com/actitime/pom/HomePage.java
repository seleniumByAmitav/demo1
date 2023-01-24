package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="container_tasks")
	private WebElement taskTab;
	@FindBy(id="logoutLink")
	private WebElement lgbtn;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setLogout() {
		lgbtn.click();
	}
	public void setTaskTab() {
		taskTab.click();
	}
}
