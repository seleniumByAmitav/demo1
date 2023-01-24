package com.actitime.generic;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LitenerImplementation extends BaseClass1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String text = result.getName();
		TakesScreenshot ta=(TakesScreenshot) driver;
		File src = ta.getScreenshotAs(OutputType.FILE);
		File f=new File("./screenshot/"+text+".png");
		try {
			FileUtils.copyFile(src, f);
		} catch (IOException e) {
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
			}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
			}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
			}

}
