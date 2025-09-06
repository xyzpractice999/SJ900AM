package tests;

import org.testng.annotations.Test;

public class NewTest3 {
  @Test(groups={"smoke","sanity"})
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(groups={"smoke"})
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(groups={"reg"})
  public void test3() {
	  System.out.println("test3");
  }
}
