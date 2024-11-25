package Testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser {
	WebDriver driver;
  @Test
  @Parameters({"browser"})
  public void Allbrowser(String br) {
	  switch(br.toLowerCase()) {
	  case "chrome": {
		   driver = new ChromeDriver();
		  break;
	  }
	  case "edge": {
		  driver = new EdgeDriver();
		  break;
	  }
	 
	  }
	  
	  driver.get("https://www.amazon.com");
	  
	  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("watches");
	  driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	  
  }
//  @Test
//  public void r() {
//	  driver = new ChromeDriver();
//	  driver.get("https://www.amazon.com");
//	  
//  }
//  @Test
//  public void r1() {
//	  driver = new EdgeDriver();
//	  driver.get("https://www.amazon.com");
//	  
//  }
 
 
}
