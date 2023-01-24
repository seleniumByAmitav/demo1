package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskTabPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewCust;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCust;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
    private WebElement custDesc;
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement exeCust;
	@FindBy(xpath="//div[text()='Our company']")
	private WebElement ourCom;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement creCust;
	public TaskTabPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setTask(String cn,String ds) {
		addNewCust.click();
		newCust.click();
		custName.sendKeys(cn);
		custDesc.sendKeys(ds);
		exeCust.click();
		ourCom.click();
		creCust.click();
		
	}

}
