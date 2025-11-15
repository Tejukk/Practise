package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tutorialspoint {
	public static void main(String[] args) throws InterruptedException {
        WebDriver d = new ChromeDriver();
        d.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        d.manage().window().maximize();
		/*
		 * d.findElement(By.id("name")).sendKeys("Tejaswini");
		 * d.findElement(By.id("email")).sendKeys("tejukhandbahale03@gmail.com");
		 */
        WebElement name = d.findElement(By.id("name"));
        name.click();
        name.sendKeys("Tejaswini");
        Thread.sleep(2000);
        
        WebElement email = d.findElement(By.id("email"));
        email.click();
        email.sendKeys("tejukhandbahale03@gmail.com");
        Thread.sleep(2000);
		/*
		 * WebElement male = d.findElement(By.id("gender")); male.click();
		 */
        
        WebElement female = d.findElement(By.xpath("//input[@id='name']//following::input[3]"));
        female.click();
        Thread.sleep(2000);
        
        WebElement mobi = d.findElement(By.id("mobile"));
        mobi.click();
        mobi.sendKeys("9345754542");
        Thread.sleep(2000);
        
        WebElement dob = d.findElement(By.id("dob"));
        dob.click();
        dob.sendKeys("01-01-2003");
        Thread.sleep(2000);
        
        WebElement subjects = d.findElement(By.id("subjects"));
        subjects.click();
        subjects.sendKeys("mathematics");
        Thread.sleep(2000);
        
        WebElement hobbies = d.findElement(By.xpath("//input[@id='name']//following::input[10]"));
        hobbies.click();
        Thread.sleep(2000);
        
        
      //  d.findElement(By.name("picture")).sendKeys("C:\\Users\\cdac.CDACLAB-148\\Pictures\\Screenshots\\Screenshot 2025-11-12 092616.png");
        
        WebElement w9=d.findElement(By.name("picture"));
        w9.sendKeys("C:\\Users\\CDAC\\Pictures\\Screenshots");
        Thread.sleep(1000);
        
		WebElement address = d.findElement(By.xpath("//textarea[@id='picture']"));
        address.sendKeys("Met Nashik");
        address.click();
        Thread.sleep(2000);
        
        WebElement state = d.findElement(By.xpath("//select[@id='state']"));
        Select sr = new Select(state);
        sr.selectByIndex(3);
        System.out.println(state.getText());
        
       WebElement city = d.findElement(By.xpath("//select[@id='city']"));
       Select ct = new Select(city);
       ct.selectByIndex(3);
     
       
       WebElement login= d.findElement(By.xpath("//a[@href =\"login.php\"]"));
       login.click();
       Thread.sleep(1000);
       
       WebElement user = d.findElement(By.id("email"));
       user.click();
       user.sendKeys("tejuKhandbahale03@gmail.com");
       Thread.sleep(1000); 
       
       
       
       
	}
}
