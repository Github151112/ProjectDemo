package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/CountryDropdown.html");
		
		//identify the dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		//create the object of select class
		Select s = new Select(dropdown);
		
		//use the method selectByIndex()
		//s.selectByIndex(1);
		
		//s.selectByValue("4");
		
		s.selectByVisibleText("China");
	}

}
