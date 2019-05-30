package SeleniumFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;



public class NewTest {
	
	static WebDriver driver;
	
  @Test
  public void WildTest() {
	  
	  System.out.println("TC 1 test");
	  
	  driver.get("https://www.islamicfinder.org/");
	  
	  
  }
 

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test");
	  
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver//New//chromedriver.exe");
	  
	   driver = new ChromeDriver();
	  
  }
  
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After Test");
  }
  
  

}
