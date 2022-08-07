package com.saucedemopomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass 
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

public LoginPomClass(WebDriver driver)
{
	this.driver=driver;       
	PageFactory.initElements(driver,this);

}











}
