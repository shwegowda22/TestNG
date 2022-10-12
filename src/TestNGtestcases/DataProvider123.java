package TestNGtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider123 {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/");
	}

	@Test(dataProvider = "users")
	void Login(String uname, String password)
	{
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(uname);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys(password);
		driver.findElement(By.linkText("SIGN-ON")).click();
		 driver.navigate().back();   
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");

		
	}
	
	@DataProvider (name = "users")
	String[][] loginData()
	{
		String data[][]= {{"hello","new1"}, {"hi","new2"}, {"Morning","new3"}};
		return data;
	}
	
	@AfterClass
	void CloseBrowser()
	{
		driver.close();
	}
}
