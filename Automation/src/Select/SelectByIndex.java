package Select;

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
		driver.get("https://www.facebook.com/r.php");
		
		//identify the dropdown
		WebElement dropdown = driver.findElement(By.id("day"));
		
		//create the object of select class
		Select s = new Select(dropdown);
		
		//use the method 
		for(int i=0;i<31;i++)
		{
			s.selectByIndex(i);
		}

	}

}
