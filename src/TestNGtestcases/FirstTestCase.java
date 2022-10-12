package TestNGtestcases;


import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	
	public void openURL()
	{
		System.out.println("OpenURL");
	}
	
	@Test(priority=2)
	public void logIn()
	{
		System.out.println("LogIn");
	}
	
	@Test(priority=3)
	public void logOut()
	{
		System.out.println("LogOut");
	}
	
	

}
