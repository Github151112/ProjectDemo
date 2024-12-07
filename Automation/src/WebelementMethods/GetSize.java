package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchTextField = driver.findElement(By.id("small-searchterms"));
		
		System.out.println(searchTextField.getSize());
		
		System.out.println(searchTextField.getLocation());
		
		
		Rectangle r = searchTextField.getRect();
		
		System.out.println(r.getHeight());
		
		System.out.println(r.getWidth());
		
		System.out.println(r.getX());
		
		System.out.println(r.getY());
		
	}

}
