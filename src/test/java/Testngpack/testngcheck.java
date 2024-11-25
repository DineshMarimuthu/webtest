package Testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testngcheck {
  @Test()
  @Parameters({"name"})
  public void Test1(@Optional("Marimuthu")String name) {
	  System.out.println("Test1");
	  System.out.println(name);
  }
  @Test()
  @Parameters({"name"})
  public void Test2(String name) {
	  System.out.println("Test2");
	  System.out.println(name);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod1");
  }

//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("BeforeClass1");
//  }
//
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("AfterClass1");
//  }

//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("BeforeTest1");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("AfterTest1");
//  }

//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("BeforeSuite1");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("AfterSuite1");
//  }

}
