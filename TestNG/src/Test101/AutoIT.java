package Test101;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Driver\\GK\\New\\geckodriver.exe");
		
		WebDriver Driver = new FirefoxDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("file:///C:/Users/Shahid/Desktop/Upload.html");
		
		Driver.findElement(By.xpath(".//*[@id='101']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Shahid\\Desktop\\UploadsAuto\\UploadFile.exe");
		
		

	}

}
