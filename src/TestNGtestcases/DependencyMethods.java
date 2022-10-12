package TestNGtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test(priority=1)
	void openURL()
	{
		System.out.println("URL opened");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openURL"})
	void logIn()
	{
		System.out.println("Login test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"logIn"})
	void search()
	{
		System.out.println("Searchtext");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"search","logIn"})
	void advancedsearch()
	{
		System.out.println("Advanced");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"logIn"})
	void logOut()
	{
		System.out.println("Logout");
		Assert.assertTrue(true);
	}

}
