package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://accounts.saucelabs.com/am/XUI/#login/");
		dr.manage().window().fullscreen();
	
		
		System.out.println(dr.getTitle());
		WebElement txtbox = dr.findElement(By.id("idToken1"));
		Actions a = new Actions(dr);
		Thread.sleep(2000);
		
		a.moveToElement(txtbox).contextClick().build().perform();
		Thread.sleep(2000);
		txtbox.sendKeys("Hera_Pheri");
		
		a.doubleClick(txtbox).build().perform();
		
	
		
	}

}
