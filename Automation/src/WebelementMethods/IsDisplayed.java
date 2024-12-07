package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));

		if (logo.isDisplayed())
			System.out.println("Logo is displayed");
		else
			System.out.println("logo is not displayed");

	}

}
