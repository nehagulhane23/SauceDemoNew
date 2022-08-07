package com.saucedemopomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPomClass 
{
WebDriver driver;

@FindBy(xpath = "//input[contains(@id,'user-name')]")  

private WebElement username;

public void findusername()
{
	username.sendKeys("standard_user");
}

@FindBy(xpath = "//input[@id='password']") 
private WebElement password;
public void findpassword()
{
	password.sendKeys("secret_sauce");
}

@FindBy(xpath = "//input[@id='login-button']") 
private WebElement loginbutton;

public void findloginbutton()
{
	loginbutton.click();
}

@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
private WebElement clickonthreelines;

public void clickonthree()
{
	clickonthreelines.click();
}

@FindBy (xpath = "//a[@id='logout_sidebar_link']")
private WebElement clickonlogout;

public void logoutbutton()
{
	clickonlogout.click();
}

public LogoutPomClass(WebDriver driver)
{
	this.driver=driver;
	
    PageFactory.initElements(driver, this);
	
}

















}
