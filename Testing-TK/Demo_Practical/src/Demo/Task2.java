package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		String pw = d.getWindowHandle();
		d.get("http://www.google.com");
		
		
		//new tab 
		d.switchTo().newWindow(WindowType.TAB);
		String cw = d.getWindowHandle();
		d.get("http://www.gmail.com");
		
		d.switchTo().window(pw);
		
	}
	
}
