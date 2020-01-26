package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Feature5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	
	@Test(invocationCount=3,priority=3)
	public void tc_04() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.close();
	}
	
}