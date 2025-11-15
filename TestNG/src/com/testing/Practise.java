package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise {
  @Test
  public void f() throws InterruptedException {
	  WebDriver dr  = new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	   WebElement user = dr.findElement(By.id("username"));
	   user.sendKeys("student");
	  Thread.sleep(1000); 
	  
	  WebElement  js1 = dr.findElement(By.xpath("//a[@href=\'https://practicetestautomation.com/privacy-policy/\']"));
	  JavascriptExecutor js=(JavascriptExecutor)dr;
	  js.executeScript("arguments[0].scrollIntoView(true);", js1);
	   
	  	   
	   
	  
	  
  }
}
