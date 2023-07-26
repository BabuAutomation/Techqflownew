package Stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Opne Chorme Browser")
	public void opne_chorme_browser() {
	    
		driver=new ChromeDriver();
	}

	@Given("Open URL {string}")
	public void open_url(String string) {
	  
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Login ID Login Password")
	public void login_id_login_password() {
	   
		driver.findElement(By.name("uid")).sendKeys("mngr515501");
		driver.findElement(By.name("password")).sendKeys("ydaruhy");
	}

	@When("Click on Submit")
	public void click_on_submit() {
	   
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("Redirect to Bankpage")
	public void redirect_to_bankpage() {
	    
		boolean status=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}

	@Then("Clicik on New Customer")
	public void clicik_on_new_customer() throws InterruptedException  {
		
		driver.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
		
		/*driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
	
		WebElement Frm=driver.findElement(By.id("ad_iframe"));
		driver.switchTo().frame(Frm);
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
		
		/*WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
	    driver.switchTo().frame(frame1);
	    WebElement frame2 = driver.findElement(By.id("ad_iframe"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.id("dismiss-button")).click();*/
	    
	    
	}



}
