package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

 public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
		public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
	    String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pwd);
	}
	@AfterMethod
	public void logout() {
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
