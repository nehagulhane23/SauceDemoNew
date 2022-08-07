package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemopomclasses.Homepagepomclass;
import com.saucedemopomclasses.LoginPomClass;

public class TC005_VerifyDropDownFunctionality extends TestBaseClass
{

@Test
public void filterbutton()
{
	Homepagepomclass f = new Homepagepomclass(driver);
	f.clickonfilterbutton();
	
	String expectedtext = "Name (Z to A)";
	String actualtext =f.gettextoffilter();
	
	System.out.println(actualtext);
	
	if (expectedtext.equals(actualtext))
	{
		System.out.println("passed");
	}
	
	else
	{
		System.out.println("Failed");
	}
}
	

}









