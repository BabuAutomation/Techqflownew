package DataDriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadFileRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://get.adobe.com/reader/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/div[2]/div[5]/button")).click();
		driver.switchTo().alert().accept();
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_KP_LEFT);
		robo.keyRelease(KeyEvent.VK_KP_LEFT);
		robo.keyPress(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_ALT);
		robo.keyRelease(KeyEvent.VK_D);
		
		StringSelection str=new StringSelection("F:\\Testing QA");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_ALT);
		robo.keyRelease(KeyEvent.VK_S);
		
		
		
	}

}
