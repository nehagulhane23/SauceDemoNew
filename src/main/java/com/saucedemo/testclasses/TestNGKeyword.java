package com.saucedemo.testclasses;

import org.testng.annotations.Test;

public class TestNGKeyword 
{
@Test (priority=1, enabled = true)
public void Amethod1()
{
	System.out.println("Method1");
}
@Test(priority=3)
public static void Bmethod2() 
{
	System.out.println("Method2");
}
@Test(invocationCount =-1,priority=0)
public static void Cmethod3() 
{
	System.out.println("Method3");
}

}
