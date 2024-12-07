package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSwiggy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swiggy.com");
		
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		Thread.sleep(2000);
		
		//click on pizza
		driver.findElement(By.xpath("(//img[@class='styles_img__3HNZ4'])[2]")).click();
		
		
		
		
	}
}
