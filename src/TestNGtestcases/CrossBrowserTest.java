package TestNGtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters("browser")
	public void launchBrowser(String Br)
	{
			System.out.println(Br);
		if(Br.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(Br.equals("Edge"))
			{
			System.setProperty("webdriver.edge.driver", "C:\\Selenium_webdriver\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();
			}
		
		driver.get("https://demo.guru99.com/test/newtours/");
	
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
		
	}
	
	@Test(priority=3)
	public void registration()
	{
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("hello");
		driver.findElement(By.linkText("SIGN-ON")).click();
		
	}
	
	@Test(priority=4)
	public void closeBrowser()
	{
		driver.close();
		
	}

}
