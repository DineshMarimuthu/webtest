package webtest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().deleteAllCookies();
		
		Dimension d= new Dimension(1000,1000);
		driver.manage().window().setSize(d);
		
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		driver.navigate().to("https://www.amazon.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		driver.findElement(By.id("nav-search-submit-button")).click();		
//		 String tag=driver.findElement(By.id("nav-search-submit-button")).getTagName();
//		 System.out.println(tag);
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[3]/div[1]/h2/a/span")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and  @value='watches']")).click();
		 String search=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		 System.out.println(search);
	}

}
