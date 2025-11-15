package PracticeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestPrac 
{
  @Test
 
  public void f( ) throws InterruptedException
  {
	  
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://demo.automationtesting.in/Register.html");
	  dr.manage().window().fullscreen();
	  
	  Thread.sleep(2000);
	  
	  WebElement gender = dr.findElement(By.xpath("//input[@value='FeMale']"));
	  gender.click();
	  
	 WebElement lan = dr.findElement()	  ;
	  
	  
	  
  }
}
