package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://shoppersstack.com/");

		// click on any product
		driver.findElement(By.xpath("//span[text()=' FAIR AND HANDSOME']")).click();

		// send the pin code
		driver.findElement(By.id("Check Delivery")).sendKeys("5654945");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

		driver.findElement(By.id("Check")).click();
	}

}
