package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemopomclasses.LoginPomClass;
import com.saucedemopomclasses.LogoutPomClass;

public class TC002_VerifyLogoutFunctionality extends TestBaseClass
{
@Test
public void logoutfunctionalit()
{
	LogoutPomClass logout = new LogoutPomClass(driver);
	logout.clickonthree();
	logout.logoutbutton();
	
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	if (expectedTitle.equals(actualTitle))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
}

	
	
	
}


















