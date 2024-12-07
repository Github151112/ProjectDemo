package Locators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class LinkText {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/r')]")).click();
		
		
	}

}
