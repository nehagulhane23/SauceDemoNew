package com.saucedemopomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class PLoginPomClass 
//{
//    //Step 1= declare webdriver globally
//	WebDriver driver;
//	
//	//Step 2=to inspect element plz use FindBy annotation
//    @FindBy(xpath = "//input[contains(@id,'user-name')]") WebElement username;
//    
//    //step 3= to perform action on webelement, create one method
//    
//    public void findusername()
//    {
//    	username.sendKeys("standard_user");
//    }
//// likewise repeat the steps 2 & 3 to find other webelement present on webpage
//    
//    @FindBy(xpath = "//input[@id='password']") WebElement password;
//    
//    public void findpassword()
//    {
//    	password.sendKeys("secret_sauce");
//    }
//
//    @FindBy(xpath = "//input[@id='login-button']") WebElement loginbutton;
//    
//    public void findloginbutton()
//    {
//    	loginbutton.click();
//    }
//
//
//    //step 4 create one constructer 
//    public PLoginPomClass(WebDriver driver)
//    {
//    	this.driver=driver;       //this keyword is used here to differentiate variable
//    
//    	PageFactory.initElements(driver,this);
//    //class          method of pagefactory class
//    }
//
////now this is the complete pom class is....
////in pom class we only find the elements and perform actions on it
//





//}
