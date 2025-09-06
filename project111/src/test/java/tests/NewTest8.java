package tests;

import org.testng.annotations.Test;

public class NewTest8 {
  @Test(priority=1)
  public void btest1() {
	  System.out.println("test1");
  }
  @Test(priority=3)
  public void atest2() {
	  System.out.println("test2");
  }
  @Test(priority=2)
  public void ctest3() {
	  System.out.println("test3");
  }
}
