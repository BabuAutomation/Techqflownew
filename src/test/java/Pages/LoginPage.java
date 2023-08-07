package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	By Header=By.xpath("//h2");
	By UserName=By.xpath("//tr[1]/td[2]/input");
	By Password=By.xpath("//tr[2]/td[2]/input");
	By Submit=By.xpath("//tr[3]/td[2]/input[1]");
	
	String URL="https://www.demo.guru99.com/V4/";
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void VerifyHeder()
	{
		String GetHeaderTxt=driver.findElement(Header).getText();
		Assert.assertEquals(GetHeaderTxt, "Guru99 Bank", "Not Matching");
		System.out.println(GetHeaderTxt);
	}
	
	public void URL()
	{
		driver.get(URL);
	}
	
	public void Login()
	{
		driver.findElement(UserName).sendKeys("mngr519427");
		driver.findElement(Password).sendKeys("pypedAg");
		driver.findElement(Submit).click();
	}

}
