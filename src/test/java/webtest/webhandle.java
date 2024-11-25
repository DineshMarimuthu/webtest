package webtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows/");
		String s1=driver.getWindowHandle();
		System.out.println(s1);
		WebElement ws= driver.findElement(By.xpath("//div[@id='windowButtonWrapper']//button"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//div[@id='windowButtonWrapper']//button")).click();
		Set<String> s2=driver.getWindowHandles();
		System.out.println(s2);
		for(String x:s2) {
			driver.switchTo().window(x);
			Dimension dim= new Dimension(500,500);
			driver.manage().window().setSize(dim);
			driver.switchTo().defaultContent();
		}
		js.executeScript("window.scrollBy(0,-500)");
	}

}
