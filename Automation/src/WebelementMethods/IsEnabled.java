package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.name("email"));

		if (username.isEnabled()) {
			username.sendKeys("8515618584");
		} else {
			System.out.println("Username is disabled");
		}
	}

}
