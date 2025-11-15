package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AleartHandling 
{

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
   
	
	}

}
