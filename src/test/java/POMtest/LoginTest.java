package POMtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseClass{
	
	WebDriver driver;
		
	@Test(priority=1)
	void Header()
	{
		ObjLoginPage.VerifyHeder();
	}
	
	@Test(priority=2)
	void Login()
	{
		ObjLoginPage.Login();
	}
	
	@Test(priority=3)
	void Title()
	{
		ObjHomePage.VerifyHeader();
	}
	@Test(priority=4)
	void NewCustomer()
	{
		ObjHomePage.NewCustomer();
	}

	
}
