package com.saucedemopomclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepagepomclass 
{
private WebDriver driver;
 Select s;

@FindBy(xpath="(//body//div//button)[3]") WebElement addtocartbag1;

public void clickonatcbutton1()
{
	addtocartbag1.click();
}

@FindBy(xpath="(//body//div//button)[4]") WebElement addtocartbag2;

public void clickonatcbutton2()
{
	addtocartbag2.click();
}

@FindBy(xpath="(//body//div//button)[5]") WebElement addtocartbag3;

public void clickonatcbutton3()
{
	addtocartbag3.click();
}

@FindBy(xpath="(//body//div//button)[6]") WebElement addtocartbag4;

public void clickonatcbutton4()
{
	addtocartbag4.click();
}

@FindBy(xpath="(//body//div//button)[7]") WebElement addtocartbag5;

public void clickonatcbutton5()
{
	addtocartbag5.click();
}

@FindBy(xpath="(//body//div//button)[8]") WebElement addtocartbag6;

public void clickonatcbutton6()
{
	addtocartbag6.click();
}
// all products are added in cart

@FindBy (xpath="//button[text()='Add to cart']")

private List <WebElement> allitems;

public void addallitems()
{
for (WebElement i:allitems)
{
	i.click();
}

}

@FindBy(xpath = "//select[@class='product_sort_container']")
WebElement filter;


public void clickonfilterbutton()
{
	filter.click();
	s.selectByValue("za"); 
}
public String gettextoffilter()
{
	return filter.getText();
}
//add to cart element

@FindBy(xpath="//div[@id='shopping_cart_container']")
private WebElement addtocart;

public void clickaddtocartbutton()
{
	addtocart.click();
}

public String gettextofcart()
{
	return addtocart.getText();
	
}
@FindBy(xpath="//body//div//button)[1]")
private WebElement settingbutton;

public void clicksettingbutton()
{
	settingbutton.click();

}

@FindBy(xpath = "//a[@id='about_sidebar_link']")
private WebElement aboutbutton;

public void clickonaboutbutton()
{
	aboutbutton.click();
}

public Homepagepomclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	s = new Select(filter);
}



























}
