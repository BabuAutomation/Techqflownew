package Testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAnDAfter {
	
	
	WebDriver driver;
	
	@BeforeMethod()
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
	}
	
	@Test(priority=1) 
	void Search()
	{
		boolean Guru99=driver.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed();
		Assert.assertEquals(Guru99, true);
	}
	
	@Test(priority=2)
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr511829");
		driver.findElement(By.name("password")).sendKeys("EbUvaze");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test(priority=3)
	void Advsearch()
	{
		System.out.println("Advsearch");
	}
	
	@AfterMethod()
	void close()
	{
		driver.close();
	}
	
}
