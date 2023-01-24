package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass1;

public class CreateTask extends BaseClass1 {
	@Test
	public void createTask()
	{
		Reporter.log("Creating task",true);
	}
	@Test
	public void ModifyTask() {
		Reporter.log("Modifying Task",true);
	}
}
