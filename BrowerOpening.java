package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowerOpening {
	 WebDriver dr = new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(5000);
	  WebElement web = dr.findElement(By.name("username"));
	  web.click();
	  web.sendKeys("Admin");
	  
	  Thread.sleep(5000);
	  WebElement pass = dr.findElement(By.name("password"));
	  pass.click();
	  pass.sendKeys("admin123");
	  
	  Thread.sleep(5000);
	  WebElement login = dr.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
	  Thread.sleep(1000);
  }
  @BeforeTest
  public void beforeTest() {
	 
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  dr.manage().window().fullscreen();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(1000);
	  dr.close();
	 
  }

}
