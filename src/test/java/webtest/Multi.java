package webtest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		List <WebElement> w1= driver.findElements(By.tagName("a"));
		System.out.println(w1.size());
//		for (WebElement w:w1) {
//			System.out.println(w.getAttribute("href"));
//		}
		WebElement w = driver.findElement(By.xpath("//select"));
		Select s=new Select(w);
		s.selectByIndex(3);

			

	}

}
