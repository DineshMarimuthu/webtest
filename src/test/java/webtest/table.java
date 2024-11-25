package webtest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class table {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		WebElement ts= driver.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//To scroll down
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//To scroll up
		j.executeScript("window.scrollBy(0,-500)");
		j.executeScript("arguments[0].setAttribute('value','dresses')",ts);
//		Actions a1=new Actions(driver);
//		WebElement clicker= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"));
//		a1.contextClick(clicker).perform();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId.size());
//		TakesScreenshot ss= (TakesScreenshot)driver;
//		File src= ss.getScreenshotAs(OutputType.FILE);
//		File des=new File("H:/screenshot.png");
//		FileUtils.copyFile(src,des);
//		WebElement ts2= driver.findElement(By.id("nav-search-submit-button"));
//		Actions a= new Actions(driver);
//		a.moveToElement(ts2).click().build().perform();
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		WebElement src1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
//		WebElement des=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
//		a.dragAndDrop(src1, des).perform();
	}

}
