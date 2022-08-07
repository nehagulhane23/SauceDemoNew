package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemopomclasses.Homepagepomclass;
import com.saucedemopomclasses.LoginPomClass;

public class TC003_VerifySingleProdCartFunctionality extends TestBaseClass
{
@Test
public void singleitemaddtocart()
{
	Homepagepomclass singleprod = new Homepagepomclass (driver);
	singleprod.clickonatcbutton1();
	
	String actualtext = singleprod.gettextofcart();
	System.out.println(actualtext);
	   String expectedCount = "1";
	   
	   
	   if(expectedCount.equals(actualtext))
	   {
		   System.out.println("TC is passed");
	   }
	   else
	   {
		   System.out.println("TC is failed");
	   }
	   }










}
