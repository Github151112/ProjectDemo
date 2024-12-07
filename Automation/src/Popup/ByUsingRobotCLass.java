package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingRobotCLass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		//click on i am experienced
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'uploadResume')]")).click();
		
		Thread.sleep(2000);
		
		//select the path
		StringSelection path = new StringSelection("C:\\Users\\AMAN SINGH\\OneDrive\\Desktop\\Prince-CV.pdf");
		
		//copy in clipboard
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(path, null);
		
		//paste the path
		Robot r = new Robot();
		
		//paste the path
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//press enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
				
		
	}

}
