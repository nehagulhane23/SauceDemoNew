package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemopomclasses.Homepagepomclass;
import com.saucedemopomclasses.LoginPomClass;

public class TC004_VerifyAllProdCartFunctionality extends TestBaseClass
{

@Test
public void allproducts()
{
	Homepagepomclass allprod = new Homepagepomclass(driver);
	allprod.addallitems();
	
	String expectedtitle = "6";
	String actualTitle = allprod.gettextofcart();
	
	if (expectedtitle.equals(actualTitle))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
}	
	


}











