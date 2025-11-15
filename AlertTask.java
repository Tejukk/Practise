package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver d = new ChromeDriver();
    d.get("https://demo.automationtesting.in/Alerts.html");
    Thread.sleep(4000);
    d.manage().window().maximize();
    d.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
    Alert al = d.switchTo().alert();
    System.out.println(al.getText());
    al.accept();
   
    
    WebElement login= d.findElement(By.xpath("//a[@href='#CancelTab']"));
    login.click();
    Thread.sleep(1000);
    
    WebElement bttn = d.findElement(By.xpath("//button[@onclick='confirmbox()']"));
    bttn.click();
    Thread.sleep(1000);
    Alert a1 = d.switchTo().alert();
    System.out.println(a1.getText());
    a1.accept();
    
    WebElement cancel = d.findElement(By.id("demo"));
    System.out.println(cancel.getText());
    Thread.sleep(1000);
    
    
    
    
	
	}

}
