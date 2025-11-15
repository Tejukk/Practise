package com.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class NewTest101 {
  @Test
  public void f() throws Exception {
	   
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://testautomationpractice.blogspot.com/");
	  dr.manage().window().maximize();
	  
	 
  }
}
