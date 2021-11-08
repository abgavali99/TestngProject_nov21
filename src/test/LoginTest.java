/*package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;


public class LoginTest extends Baseclass {
	
	
    WebDriver driver;
    
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        
        driver = new ChromeDriver();
        
        
//        System.setProperty("webdriver.gecko.driver","geckodriver");
//        
//        WebDriver driver  = new FirefoxDriver    ();
//        
        driver.get("https://www.simplilearn.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        
    }
    
    
    @Parameters({"Username", "Password"})

    @Test
    public void Negativelogin(String UserNameVal, String PasswordVal) {
    	Login(UserNameVal ,PasswordVal)
        
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(LoginLink));
            
        LoginLink.click();
        
        WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys(UserNameVal);
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys(PasswordVal);
        
        WebElement Remember = driver.findElement(By.className("rememberMe"));
        Remember.click();
        
        WebElement LoginButton = driver.findElement(By.name("btn_login"));
        LoginButton.click();
        
        WebElement Error = driver.findElement(By.id("msg_box"));
        
        String Actualmsg = Error.getText();
        String Expmsg = "The email or password you have entered is invalid.";
        //Assert.assertEquals(Actualmsg , Expmsg);
        SoftAssert soft =new SoftAssert();
        soft.assertEquals(Actualmsg, Expmsg);
        System.out.println("After assertion");
        System.out.println("After assertion");
        System.out.println("After assertion");
        System.out.println("After assertion");
        
        soft.assertAll();
    }
}
        
        
        /*if(Actualmsg.equals(Expmsg))
        {
            System.out.println("Test Passed");
        }else
        {
            System.out.println("Test Failed");
        }
        
    }
    
    
    @AfterMethod
    public void teardown() {
        
        driver.quit();
        
    }

}*/



package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LoginTest extends Baseclass {

    @Parameters({"UserName", "Password"})
    @Test
    public void Negativelogin(String UserNameVal, String PasswordVal) {
        
        test=report.startTest("Negative login Test");
        LoginPage Login = new LoginPage();
        Login.login(UserNameVal,PasswordVal);
        Login.Errorcheck();
        report.endTest(test);
    }
    
    
    @Parameters({"UserName", "CorrectPassword"})
    @Test
    public void Positivelogin(String UserNameVal, String PasswordVal) {
        
    	test=report.startTest("Positive login Test");
        LoginPage Login = new LoginPage();
        Login.login(UserNameVal,PasswordVal);
        report.endTest(test);
        
    }
    
}