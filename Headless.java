package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {
	public static void main(String[] args) throws InterruptedException {
		//Google
		ChromeOptions cc= new ChromeOptions();
		cc.addArguments("headless");
		
		WebDriver dr = new ChromeDriver(cc);//Headless open karych ahe 
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
		
		//Firefox
		FirefoxOptions ff = new FirefoxOptions();
		ff.addArguments("--headless");
		WebDriver fr = new FirefoxDriver(ff);
		fr.get("http://www.firefox.com");
		System.out.println(fr.getTitle());
		
	
	  //	
		ChromeOptions cc1 = new ChromeOptions();
        cc1.addArguments("Incognito");
        
        WebDriver dr1 = new ChromeDriver();
        dr.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(dr1.getTitle());
        
	}
}
