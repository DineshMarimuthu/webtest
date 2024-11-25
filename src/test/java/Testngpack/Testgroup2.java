package Testngpack;

import org.testng.annotations.Test;

public class Testgroup2 {
  @Test(groups="g1")
  public void Test1() {
	  System.out.println("Test Group2--group1");
  }
  @Test(groups="g2")
  public void Test2() {
	  System.out.println("Test Group2--group2");
  }
  
  
  @Test(groups={"g1","g2","g3"})
  public void Test4() {
	  System.out.println("testgroup2 Combined grp1 and grp2");}}
  
 
