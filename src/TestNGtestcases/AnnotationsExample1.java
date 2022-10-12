package TestNGtestcases;

import org.testng.annotations.*;

public class AnnotationsExample1 {

	@BeforeMethod
	void LogIN()
	{
		System.out.println("Logged in");
	}
	
	@AfterMethod
	void LogOut()
	{
		System.out.println("Logged out");
	}
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search Text");

	}
	
	@Test(priority=3)
	
	void Recharge()
	{
		System.out.println("Recharge Text");

	}
	
	@Test(priority=2)
	
	void advSearch()
	{
		System.out.println("Advance Text");

	}
}
