package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	By Header=By.xpath("//tr[2]/td/marquee");
	By NewCustomer=By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By CustomerName=By.xpath("//tr[4]/td[2]/input");
	By Gender=By.xpath("//tr[5]/td[2]/input[1]");
	By DOB=By.xpath("//*[@id=\"dob\"]");
	By Address=By.xpath("//tr[7]/td[2]/textarea");
	By City=By.xpath("//tr[08]/td[2]/input[1]");
	By State=By.xpath("//tr[09]/td[2]/input[1]");
	By PIN=By.xpath("//tr[10]/td[2]/input[1]");
	By Mobile=By.xpath("//tr[11]/td[2]/input[1]");
	By Email=By.xpath("//tr[12]/td[2]/input[1]");
	By Password=By.xpath("//tr[13]/td[2]/input[1]");
	By Submit=By.xpath("//tr[14]/td[2]/input[1]");
	String URL="https://www.demo.guru99.com/V4/manager/addcustomerpage.php";
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void VerifyHeader()
	{
		String GetHeaderTx=driver.findElement(Header).getText();
		Assert.assertEquals(GetHeaderTx, "Welcome To Manager's Page of Guru99 Bank", "NotMatching");
		System.out.println(GetHeaderTx);
	}
	
	
	
	public void NewCustomer()
	{
		driver.findElement(NewCustomer).click();
		driver.get(URL);
		driver.findElement(CustomerName).sendKeys("Ravi");
		driver.findElement(Gender).click();
		driver.findElement(DOB).sendKeys("03/08/2023");
		driver.findElement(Address).sendKeys("Prashanth Nagar", Keys.ENTER, "Old Alwal");
		driver.findElement(City).sendKeys("Secunderabad");
		driver.findElement(State).sendKeys("Telangana");
		driver.findElement(PIN).sendKeys("500010");
		driver.findElement(Mobile).sendKeys("1234567890");
		driver.findElement(Email).sendKeys("techqflow@gmail.com");
		driver.findElement(Password).sendKeys("Pass@123");
		driver.findElement(Submit).click();
	}
}
