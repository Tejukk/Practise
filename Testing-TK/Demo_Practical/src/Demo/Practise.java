package Demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Practise 
{
	public static void main(String[] args) 
	{
		WebDriver dr  = new ChromeDriver();
		dr.get("https://demo.guru99.com/test/drag_drop.html");
		dr.manage().window().fullscreen();
		
		File ss= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		//Files.copy(ss, ss)
		
		
	}
}
