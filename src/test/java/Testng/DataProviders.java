package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	

WebDriver driver;

	@Test(priority=1)
	void OpenApp()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	    @Test(priority=2, dependsOnMethods= {"OpenApp"}, dataProvider="DP")
		void Login(String ID, String PWD)
	{
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(ID);
	
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		String ActText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String ExpText="Dashboard";
		
		Assert.assertEquals(ActText, ExpText,"Not matched");
	}
	
	@Test(priority=3, dependsOnMethods= {"OpenApp"})
	void CloseApp()
	{
		driver.close();
	}
	
	@DataProvider(name="DP")
	String[][] LoginData()
	{
		String Data[][]={
				{"ravi", "123"},
				{"babu", "678"},
				{"Admin", "admin123"}
		}; return Data;
	}
	

}
