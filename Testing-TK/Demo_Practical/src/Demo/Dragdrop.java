package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Static.html");
		dr.manage().window().fullscreen();
		
		WebElement ele = dr.findElement(By.id("angular"));
		WebElement we = dr.findElement(By.id("droparea"));
		Actions a = new Actions(dr);
		a.dragAndDrop(ele, we).build().perform();
		
		WebElement ele1 = dr.findElement(By.id("mongo"));
		Actions a1 = new Actions(dr);
		a1.dragAndDrop(ele1, we).build().perform();
		
		WebElement ele2 = dr.findElement(By.id("node"));
		Actions a2 = new Actions(dr);
		a1.dragAndDrop(ele2, we).build().perform();
		
		
		
	}
}
