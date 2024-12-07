package FIndElementts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.PAGE_UP);
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for (int i = 0; i < productName.size(); i++) {
			for (int j = i; j <= i; j++) {
				System.out.println(productName.get(i).getText() + "===>" + productPrice.get(j).getText());
			}
		}
	}
}
