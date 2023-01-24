package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority=1)
	public void CreateProject()
	{
		Reporter.log("CreateProject",true);
	}
	@Test(priority=2)
	public void ModifyProject()
	{
		Reporter.log("ModifyProject",true);
	}
	@Test(priority=3)
	public void DeleteProject()
	{
		Reporter.log("DeleteProject",true);
	}

}
