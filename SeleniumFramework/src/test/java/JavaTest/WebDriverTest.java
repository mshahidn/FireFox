package JavaTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebDriverTest {
	
	@Test
	public void Testdemo() {

	
		
	WebDriver driver;
		
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.chromedriver().version("74").setup();
		
		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
		
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		
		System.out.println("New Test Passed");
		
		
		
	}

}
