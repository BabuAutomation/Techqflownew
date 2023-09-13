package DataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		
		// Complete page screenshot
		TakesScreenshot TS=(TakesScreenshot)driver;
		File Homepage= TS.getScreenshotAs(OutputType.FILE);
		File Homepgtrg= new File("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\ScreenShots\\Homepg.png");
		FileUtils.copyFile(Homepage, Homepgtrg);

		
		//Particular element screenshot
		WebElement Ikons=driver.findElement(By.xpath(" //h1"));
		File Textpage= Ikons.getScreenshotAs(OutputType.FILE);
		File  TxtTrg=new File("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\ScreenShots\\Txt.png");
		FileUtils.copyFile(Textpage, TxtTrg);
	
	}

}
