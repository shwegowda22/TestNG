package TestNGtestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	//@Parameters("testXML")
	@Parameters({"testXML","testXML1"})
	public void m1(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	@Test
	public void m2()
	{
		System.out.println("Hello");
	}

}
