import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Feature4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	
	@Test(priority=10)
	public void tc_04() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test(priority=20)
	public void tc_05() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	

		
	}