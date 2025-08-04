package testNgAssignment;
// "Assignment 45 WAP for below annotation and check execution @Test @AfterMethod @AfterClass"
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assignmnt_45 
{
	@Test
	public void Test()
	{
	    System.out.println("Test");
	}
	@AfterClass
	public void afterClass() 
	{
	    System.out.println("After Class");
	}

	@AfterMethod
	public void afterMethod() 
	{
	    System.out.println("After Method");
	}

}
