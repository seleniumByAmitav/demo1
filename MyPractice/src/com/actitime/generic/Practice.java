package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
@Test(priority=1, invocationCount=2)
public void test1()
{
	Reporter.log("Hiii",true);
}
@Test(priority=2,dependsOnMethods="test3")
public void test2()
{
	Reporter.log("Hello",true);
}
@Test(priority=3,dependsOnMethods="test1")
public void test3()
{
	Reporter.log("Welcome",true);
}
}
