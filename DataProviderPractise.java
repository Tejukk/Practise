package com.testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderPractise {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  WebDriver dr = new ChromeDriver();
      dr.get("https://practicetestautomation.com/practice-test-login/");	  
      dr.manage().window().maximize();
      
      WebElement use = dr.findElement(By.id("usename"));
      use.sendKeys(n);
      
  
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Tejaswini", "a" },
     
    };
  }
}
