package POMtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Pages.HomePage;
import Pages.LoginPage;

public class BaseClass {
	
	WebDriver driver;
	
	LoginPage ObjLoginPage;	
	HomePage ObjHomePage;
	
	@BeforeTest
	void Setup()
	{
		driver=new ChromeDriver();
		ObjLoginPage=new LoginPage(driver);
		ObjHomePage=new HomePage(driver);
		ObjLoginPage.URL();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	
	
	

}
