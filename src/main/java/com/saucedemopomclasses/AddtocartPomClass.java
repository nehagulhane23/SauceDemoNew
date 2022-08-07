package com.saucedemopomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtocartPomClass 
{
WebDriver driver;

@FindBy (xpath = "//div[@id='shopping_cart_container']")
private WebElement aadtocart;

public void clickaddtocartbutton()
{
	aadtocart.click();
}

@FindBy (xpath = "")
private WebElement checkoutbutton;

public void clickoncheckoutbutton()
{
	checkoutbutton.click();
}

@FindBy (xpath = "//button[@id='continue-shopping']")
private WebElement continueshopping;

public void clickoncontinueshopping()
{
	continueshopping.click();
}















}
