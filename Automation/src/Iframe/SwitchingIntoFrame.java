package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingIntoFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com");
		// switch the control from main page to iframe page
		// way1
		// driver.switchTo().frame(0);
		// way 2
		// driver.switchTo().frame("send-sms-iframe");
		// way3
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));

		driver.findElement(By.id("regEmail")).sendKeys("67587987968");

	}

}
