package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Feature3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	
	WebDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void TearDown()
	{
		
		driver.close();
	}
	
	@Test
	public void tc_02() throws InterruptedException 
	{
		
		driver.get("https://www.flipkart.in/");
		Thread.sleep(3000);
		
		
	}
	
	
	
	@Test
	public void tc_03() throws InterruptedException 
	{
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
	}
	

		
	}