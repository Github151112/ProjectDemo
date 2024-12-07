package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("toys", Keys.ENTER);

		WebElement off = driver.findElement(By.xpath(
				"//a[text()='VIDGY Tent House for Baby Boy Girl Play House for 4-12 ...']/ancestor::div[@class='slAVV4']/descendant::div[@class='UkUFwK']/span"));
		System.out.println(off.getText());

	}

}
