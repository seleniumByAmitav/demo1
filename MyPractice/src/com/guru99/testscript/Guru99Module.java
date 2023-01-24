package com.guru99.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.guru99.pom.HomePage;
import com.guru99.generic.BaseClass;
import com.guru99.pom.NewCustomer;
@Listeners(com.guru99.generic.Listenerimplement.class)
public class Guru99Module extends BaseClass{
@Test
public void Login() {
	Reporter.log("Login successfull",true);
	if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	    
}
@Test
public void createNewCust() {
	Reporter.log("New Customer created");
	HomePage h=new HomePage(driver);
	h.setNew();
	NewCustomer n=new NewCustomer(driver);
	n.setCust("Amitav parida", "24","11","1999", "Kendrapara","Kendrapara","Odisha","754212","6372184465","amitavparidal1999@gmail.com");
}
}
