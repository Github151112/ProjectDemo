package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.util.concurrent.FluentFuture;

import dev.failsafe.Timeout;

public class AutomateDream11 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		driver.switchTo().activeElement().sendKeys("dscbdjhdsv");

		/*
		 * way 1 driver.switchTo().frame(0);
		 */

		/*
		 * way2 driver.switchTo().frame("send-sms-iframe");
		 */

		// way3
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));

		driver.findElement(By.id("regEmail")).sendKeys("845451515454");
		

		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();

		driver.findElement(By.id("hamburger")).click();
	}

}
