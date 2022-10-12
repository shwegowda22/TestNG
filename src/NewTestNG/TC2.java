package NewTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TC2{
	@Test
	void TestCase3()
	{
		System.out.println("TestCase 3");
	}

    @Test
	void TestCase4 ()
	{
		System.out.println("TestCase 4");
	}
    
    @Test
   	void TestCase5()
   	{
   		System.out.println("TestCase 5");
   	}
    @AfterTest
    void beforeTest()
    {
		System.out.println("Thisis after test");	
    }
}
