package com.saucedemo.testclasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemopomclasses.LoginPomClass;

public class TestBaseClass 
{
	WebDriver driver;
	@Parameters ("browsername")
	@BeforeMethod
	public void setUp(String browsername)
	{
		if (browsername.equals("chrome"))
		{
        System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if (browsername.equals("FireFox"))
		{
		System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Throw an error");
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPomClass lp = new LoginPomClass (driver);
		lp.findusername();
		lp.findpassword();
		lp.findloginbutton();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		System.out.println("browser is closed");
	}

























}
