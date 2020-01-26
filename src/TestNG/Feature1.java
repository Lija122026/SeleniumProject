package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Feature1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	
	@Test
	public void tc_01() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test
	public void tc_02() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	
	
	

}
