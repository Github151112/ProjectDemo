package Webelement;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		System.out.println(logo.getAttribute("src"));
		
		Dimension size = logo.getSize();
		System.out.println(size);
		
		Point axis = logo.getLocation();
		System.out.println(axis);
		
		
		Rectangle r = logo.getRect();
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());
		
		if(logo.isDisplayed())
			System.out.println("displayed");
		else
			System.out.println("not displayed");
		
		
		
		
		
		
		
		
		WebElement searchTF = driver.findElement(By.name("q"));
		
		System.out.println(searchTF.isEnabled());
		
		if(searchTF.isEnabled())
			searchTF.sendKeys("books");
		else
			System.out.println("it is disabled");

		
		
	}

}
