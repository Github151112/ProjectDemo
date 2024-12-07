package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");

		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.id("btn30"))).perform();
		a.click(driver.findElement(By.xpath("//div[text()='Yes']"))).perform();
	}

}
