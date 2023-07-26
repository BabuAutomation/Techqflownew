package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {
WebDriver driver;
	
	@Test(priority=1, groups= {"Sanity", "Regression"})
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(priority=2, groups= {"Regression"})
	void Login() 
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String Acttext= driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		String Exptext="Dashboar";
		Assert.assertEquals(Acttext, Exptext,"Not matched");
	}
	
	@Test(priority=3, groups= {"Sanity"})
	void Search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=4, groups= {"Regression"})
	void AdvSearch()
	{
		System.out.println("AdvSearch");
	}
	
	@Test(priority=5, groups= {"Sanity"})
	void TearDown()
	{
		driver.close();
	}

}
