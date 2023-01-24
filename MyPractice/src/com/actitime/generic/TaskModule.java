package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test(priority=1)
	public void CreateTask()
	{
		Reporter.log("CreateTask",true);
	}
	@Test(priority=2)
	public void ModifyTask()
	{
		Reporter.log("ModifyTask",true);
	}
	@Test(priority=3)
	public void DeleteCustomerTask()
	{
		Reporter.log("DeleteTask",true);
	}

}
