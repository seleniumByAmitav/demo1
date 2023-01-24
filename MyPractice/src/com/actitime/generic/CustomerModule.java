package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority=1)
	public void CreateModule()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test(priority=2)
	public void ModifyModule()
	{
		Reporter.log("ModifyCustomer",true);
	}
	@Test(priority=3)
	public void DeleteModule()
	{
		Reporter.log("DeleteCustomer",true);
	}

}
