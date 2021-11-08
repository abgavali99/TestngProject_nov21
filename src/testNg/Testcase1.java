package testNg;

/*import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;*/
import org.testng.annotations.Test;

public class Testcase1 extends Baseclass {
	
	/*@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Inside Before Test");
		
	}
	
	
	@BeforeMethod
	public void setup() 
	{
		System.out.println("Inside Before Method");
		
	}
	*/
	@Test(description="This test case to run home functionality")
    public void HomeLoanTest() {
        System.out.println("Inside Home Loan");
    }
	
	@Test(description="This test case to run home functionality")
	public void HomeLoanTest1() {
        System.out.println("Inside Home Loan1");
    }
	
	
    
    @Test(description="This test case to run home functionality")
    public void CarLoanTest() {
        
        System.out.println("Inside Car Loan");
    }
    /*
    @AfterMethod
    public void teardwon()
    {
    	System.out.println("Inside After method");
    }
    

	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("Inside After Test");
		
	}

	*/

}
