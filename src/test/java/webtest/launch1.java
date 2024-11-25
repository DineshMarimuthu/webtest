package webtest;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class launch1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = null;	
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter browser name");
	 String browser=sc.nextLine();
	 if (browser.equalsIgnoreCase("Chrome")) {
		 driver =new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 
	 } 

		
	driver.manage().window().maximize();
//	driver.close();
	String url= driver.getCurrentUrl();
	System.out.println(url);
		
		
		
		
	}

}
