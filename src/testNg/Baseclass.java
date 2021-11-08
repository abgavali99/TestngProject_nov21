package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;


	
	
public class Baseclass 
{
	
	
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Inside Before Test");
		
	}
	
	@BeforeClass
	public void BeforeClassM()
	{
		System.out.println("Before Class");
		
	}
	
	@BeforeMethod
	public void setup() 
	{
		System.out.println("Inside Before Method");
		
	}
	
	 @AfterMethod
	    public void teardwon()
	    {
	    	System.out.println("Inside After method");
	    }
	    
	 @AfterClass
		public void AfterClassM()
		{
			System.out.println("After Class");
			
		}
	 
		@AfterTest
		public void AfterTestMethod()
		{
			System.out.println("Inside After Test");
			
		}
		
		
		
		

}
