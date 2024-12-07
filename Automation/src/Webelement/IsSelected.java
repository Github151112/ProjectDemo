package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");

		WebElement rememberMe = driver.findElement(By.id("RememberMe"));
		rememberMe.click();
		if (rememberMe.isSelected())
			System.out.println("it is selected");
		else
			rememberMe.click();
	}

}
