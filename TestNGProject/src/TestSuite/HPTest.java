package TestSuite;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class HPTest {
	
	
  @Test(priority = 0, enabled = false)
  public void Apple1() {
	  
	  System.out.println("Testing 1");
	  
	  
  }
  
  @Test(priority = 1)
  public void Apple2() {
	  
	  System.out.println("Testing 1");
	  
	  
  }
  
  @Test(priority = 2)
  public void Apple3(){
	  
	  throw new SkipException("Skipping the test");
	  
	  //System.out.println("Hello New Test");
	  
	  //Assert.assertTrue(false);
	  
	  
  }
}
