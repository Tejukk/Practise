package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShot 
{
    public static void main(String[] args) throws IOException 
    {
        WebDriver dr=new ChromeDriver();
        dr.get("https://demo.guru99.com/test/drag_drop.html");
        dr.manage().window().maximize();
        
        WebElement img1=dr.findElement(By.id("fourth"));
        WebElement img2=dr.findElement(By.id("amt7"));
        Actions a=new Actions(dr);
        a.dragAndDrop(img1, img2).perform();
        
        WebElement img3=dr.findElement(By.id("credit2"));
        WebElement img4=dr.findElement(By.id("bank"));
        Actions a1=new Actions(dr);
        a1.dragAndDrop(img3, img4).perform();
        
        //ScreenShot
        
        File screenShot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        Files.copy(screenShot, new File("C:\\Users\\cdac.CDACLAB-148\\Desktop\\ScreenShot\\scr.png"));
        
    }
}