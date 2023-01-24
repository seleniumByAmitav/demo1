package com.guru99.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.guru99.pom.HomePage;
import com.guru99.pom.LoginPage;

class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
	}
	@BeforeMethod
	public void loginPage() throws IOException {
	FileInputStream fis=new FileInputStream("./data/banking.property");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("url");
	String un=p.getProperty("un");
	String pwd=p.getProperty("pwd");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pwd);
	}
	@AfterMethod
	public void Logout() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.setLogout();
		driver.switchTo().alert().accept();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
