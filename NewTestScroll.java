package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestScroll {
  @Test
  
	  public void f() throws InterruptedException 
	  {
		 
		  
		  WebDriver dr = new ChromeDriver();
		  dr.get("https://practice.expandtesting.com/login");
		  dr.manage().window().fullscreen();
		 
		   JavascriptExecutor js=(JavascriptExecutor)dr;
		  js.executeScript("window.scrollBy(0,560)");
		  Thread.sleep(2000);
		  WebElement user = dr.findElement(By.id("username"));
		  user.click();
		  user.sendKeys("practice");
		  
		  Thread.sleep(2000);
		  WebElement pass = dr.findElement(By.id("password"));
		  pass.click();
		  pass.sendKeys("SuperSecretPassword!");
		  Thread.sleep(2000);
		  
		  WebElement login = dr.findElement(By.id("submit-login"));
		  login.click();
		  Thread.sleep(2000);
		  
		  
  }
}
