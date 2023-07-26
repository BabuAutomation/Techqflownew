package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationandpriority {
	
	WebDriver driver;
	
	@Test(priority=1)
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2, dependsOnMethods= {"OpenApp"})
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr515501");
		driver.findElement(By.name("password")).sendKeys("ydaruhy");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
	}
	
		
	@Test(priority=3, dependsOnMethods= {"Login"}, enabled=false)
	void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=4)
	void CloseApp()
	{
		driver.close();
		
	}
	

}
