package popup2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		
		driver.findElement(By.id("buttonAlert5")).click();
		
		//it will switch the control from main page to popup
		Alert a = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		//a.accept();//if we want to click on ok 
		
		a.dismiss();//if you want to click on cancel
		
	}

}
