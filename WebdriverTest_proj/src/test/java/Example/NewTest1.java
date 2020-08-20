package Example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://google.com");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Sunita\\sunita_java1\\selenium_software_installed\\chromedriver.exe");
		driver =new ChromeDriver();
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
