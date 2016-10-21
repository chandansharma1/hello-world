package qait.gitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AppTest {
	protected WebDriver driver;
	String driverPath = "E://Chandan//New folder//Selenium Files/chromedriver_win32/chromedriver.exe";
	@Test
	public void guru99Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		driver.get("http://www.guru99.com/");
	
		driver.manage().window().maximize();
		aTitle = driver.getTitle();
		Assert.assertTrue("Title matched", aTitle.equalsIgnoreCase(eTitle));
		Reporter.log("Success");
		driver.close();		
	}
   
}
