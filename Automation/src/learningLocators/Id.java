package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("655468456464");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("ghhjgsfhdg");
		
		WebElement login = driver.findElement(By.className("_6lth"));
		login.click();
	}

}
