package TestNGtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisablingTestMethods {
	
	@Test(priority=1)
	void openURL()
	{
		System.out.println("URL opened");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	void logIn()
	{
		System.out.println("Login test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,enabled=false)
	void search()
	{
		System.out.println("Searchtext is in progress");
	
	}
	
	@Test(priority=4,enabled=false)
	void advancedsearch()
	{
		System.out.println("Advanced is in progress");
		
	}
	
	@Test(priority=5)
	void logOut()
	{
		System.out.println("Logout");
		Assert.assertTrue(true);
	}
}
