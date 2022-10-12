package NewTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

    @Test
	void TestCase1()
	{
		System.out.println("TestCase 1");
	}

    @Test
	void TestCase2()
	{
		System.out.println("TestCase 2");
	}
    
    @BeforeTest
    void beforeTest()
    {
		System.out.println("Thisis before test");	
    }
    
}
