package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Feature2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	
	@Test
	public void tc_02() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		Thread.sleep(3000);
		driver.close();
		
	}
	

		
	}
	
	
	
	
	