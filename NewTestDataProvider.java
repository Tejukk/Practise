package com.testing;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTestDataProvider {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver dr = new ChromeDriver();
      dr.get("https://practicetestautomation.com/practice-test-login/");	  
      dr.manage().window().maximize();
      
      WebElement  user = dr.findElement(By.id("username"));
        user.sendKeys(n);
      
          WebElement pass = dr.findElement(By.id("password"));
          pass.sendKeys(s);
      
        Thread.sleep(2000);
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement lo = dr.findElement(By.id("submit"));
       lo.click();
 
      //List<WebElement> el=  dr.findElements(By.tagName("input"));
      List<WebElement> el=  dr.findElements(By.tagName("a"));
      
      for (WebElement link : el) {
          System.out.println("Link Text: " + link.getText());
      }

     
      
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "student", "Password123" },
     // new Object[] { "Abc", "Password123" },
    };
  }
}
