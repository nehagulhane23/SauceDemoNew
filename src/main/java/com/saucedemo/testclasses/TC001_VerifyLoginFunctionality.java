package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemopomclasses.LoginPomClass;

public class TC001_VerifyLoginFunctionality extends TestBaseClass
{

@Test
public void loginfunctionality()
{
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	
//	if (expectedTitle.equals(actualTitle))
//	{
//		System.out.println("Test case is passed");
//	}
//	else
//	{
//		System.out.println("Test case is failed");
//	}
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	
}















}
