package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Act1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box/");
		Actions action =new Actions(driver);
		WebElement s1=driver.findElement(By.id("currentAddress"));
		s1.sendKeys("Chennai");
//		Thread.sleep(5000);
//		action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(5000);
//		action.sendKeys(Keys.TAB).build().perform();
//
//        // Paste the copied text (Ctrl+V)
//        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//			
		Dimension d1= s1.getSize();
		int height=d1.getHeight();
		int width=d1.getWidth();
		System.out.println(height);
		System.out.println(width);
		Point l = s1.getLocation();
		int x = l.getX();
		int y = l.getY();
		System.out.println("x-axis: "+x);
		System.out.println("y-axis: "+y);
			
			
	}

}
