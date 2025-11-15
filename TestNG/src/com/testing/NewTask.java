package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTask 
{
  @Test
  @Parameters({"username","password"})
  public void f(String username ,String password) throws InterruptedException 
  {
	 
	  
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practice.expandtesting.com/login");
	  dr.manage().window().fullscreen();
	
	  Thread.sleep(2000);
	  WebElement user = dr.findElement(By.id("username"));
	  user.click();
	  user.sendKeys(username);
	  
	  Thread.sleep(2000);
	  WebElement pass = dr.findElement(By.id("password"));
	  pass.click();
	  pass.sendKeys(password);
	  Thread.sleep(2000);
	  
	  WebElement login = dr.findElement(By.id("submit-login"));
	  login.click();
	  Thread.sleep(2000);
	  
	  
	  
	  
	  
  }
}
