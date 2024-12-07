
package learningLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		List<WebElement> allIphoneList = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		System.out.println(allIphoneList.size());

		WebElement actual = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']"));

		for (int i = 0; i < allIphoneList.size(); i++) {
			if (actual.getText().equals("Apple iPhone 15 (Blue, 128 GB)"))
				break;
		}
		actual.click();
	}

}
