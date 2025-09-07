package tests;

import org.testng.annotations.Test;

public class NewTest14 {
  @Test(enabled=false, description="login test with valid")
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(timeOut=2000,expectedExceptions=ArithmeticException.class)
  public void test2() throws Exception {
	  System.out.println("test2");
	  int a=45/0;
  }
  
  public void test3() {
	  System.out.println("test3122");
	  System.out.println("test33");
	  System.out.println("test33");
	  System.out.println("test3344");
  }
}
