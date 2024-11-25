package Testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testngcheck1 {
  @Test
  public void Test1() {
	  System.out.println("testfhr");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Beforemethod2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Aftermethod2");
  }

//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("BeforeTEst2");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("AfterTest2");
//  }

//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("beforesuite2");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("AfterSuite2");
//  }

}
