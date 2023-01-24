package com.actitime.testscript;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\java\\Automation\\driver\\chromedriver.exe");
	}
@Test
public void TakeScreenShot() throws IOException {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the url which you want to take Screenshot");
	String url = sc.nextLine();
	WebDriver driver=new ChromeDriver();
    driver.get(url);
    TakesScreenshot t=(TakesScreenshot) driver;
    File src = t.getScreenshotAs(OutputType.FILE);
    File f=new File("./screenshot/ss1.png");
    FileUtils.copyFile(src, f);
    driver.close();

}
}
