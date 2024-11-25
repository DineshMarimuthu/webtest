package Testngpack;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;


public class newassert {
	
	public WebDriver driver;
	
  @Test(priority=1 )
  public void Test1() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  String title=driver.getTitle();
	  Assert.assertEquals("Amazon.com. Spend less. Smile more.", title);
	  driver.close();
  }
  @Test(priority=2,dependsOnMethods= {"Test1","Test6"})
  public void Test2() {
	  Assert.assertTrue(false);
	  System.out.println("test2");
  }
  @Test(priority=3)
  public void Test3() {
	  Assert.assertTrue(true);
  }
  @Test(priority=6,dependsOnMethods= {"Test2"})
  public void Test4() {
	  //hard assertion
	  
	  System.out.println("loading");
	  System.out.println("loading");
	  Assert.assertEquals(250, 250);
	  Assert.assertTrue(false);
	  System.out.println("loading");
	  System.out.println("loading");
  }
  @Test(priority=5)
public void Test5() {
	  //soft assertion
	  
	  System.out.println("loading");
	  System.out.println("loading");
	  Assert.assertEquals(250, 250);
	  SoftAssert s1= new SoftAssert();
	  s1.assertTrue(false);
	  //Assert.assertTrue(false);
	  System.out.println("loading");
	  System.out.println("loading");
	  s1.assertAll();
  }
  @Test(priority=4)
  public void Test6() {
	  Assert.assertEquals(123,123);
//	  Assert.assertEquals(true, false);
//	  Assert.assertEquals("abc", "ABC");
//	  Assert.assertEquals("abc", "ABC");
  }
 
  


}
 