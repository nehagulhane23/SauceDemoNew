package com.saucedemo.testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.saucedemopomclasses.Homepagepomclass;
import com.saucedemopomclasses.LogoutPomClass;

public class CombineAllTestClass extends TestBaseClass
{


@Test
public void loginfunctionality()
{
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	
	if (expectedTitle.equals(actualTitle))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		System.out.println("Test case is failed");
	}
}

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

@Test
public void singleitemaddtocart()
{
	Homepagepomclass singleprod = new Homepagepomclass (driver);
	singleprod.clickonatcbutton1();
	
	String actualtext = singleprod.gettextofcart();
	System.out.println("actualtext");
	   String expectedCount = "1";
	   System.out.println("expectedCount");
	   
	   if(expectedCount.equals(actualtext))
	   {
		   System.out.println("TC is passed");
	   }
	   else
	   {
		   System.out.println("TC is failed");
	   }
	   }

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
