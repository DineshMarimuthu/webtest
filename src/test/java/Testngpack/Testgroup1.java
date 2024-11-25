package Testngpack;

import org.testng.annotations.Test;

public class Testgroup1 {
  @Test(groups="g1")
  public void Test1() {
	  System.out.println("Test Group1--group1");
  }
  @Test(groups="g2")
  public void Test2() {
	  System.out.println("Test Group1--group2");
	  
  }
  @Test(groups={"g1","g2","g3"})
  public void Test3() {
	  System.out.println("groups1 combined group1 and group2");
	  
  }
 
 }

