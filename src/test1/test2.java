package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void setup() {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balakrishnan.r\\Desktop\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
}
