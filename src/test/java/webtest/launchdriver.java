package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
//import org.openqa.selenium.chromium.HasCdp;

 

public class launchdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.flipkart.com");
		

		
	}

}
