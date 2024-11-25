package webtest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitlink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		URL url= new URL("https://demo.guru99.com");
//		HttpURLConnection con= (HttpURLConnection)url.openConnection();
//		int cde=con.getResponseCode();
//		System.out.println(cde);
//		String msg = con.getResponseMessage(); //if msg is Ok, then link is not broken
//		System.out.println(msg);
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement tr=driver.findElement(By.id("nav-search-submit-text"));
		wait.until(ExpectedConditions.elementToBeClickable(tr));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("test");
		
		
				

	}

}
