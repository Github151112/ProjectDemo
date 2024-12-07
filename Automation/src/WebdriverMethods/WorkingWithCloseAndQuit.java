package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseAndQuit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://omayo.blogspot.com/");
		
		driver.navigate().to("https://omayo.blogspot.com/");
		
		
		
		//click on new popup window
		driver.findElement(By.linkText("Open a popup window")).click();
		
		//use close method
		//driver.close();
		
		//use quit method
		driver.quit();
	}

}
