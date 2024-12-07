package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTripAutomate {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com");
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains inactive']")).click();
		driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Oct 15 2024']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='ALL']")).click();
		driver.findElement(By.xpath("//a[@data-cy='submit']")).click();
		
		driver.findElements(By.xpath(""));
	}

}
