package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		Select a = new Select(dropdown);
		for (int i = 0; i <4 ; i++) {
			a.selectByIndex(i);
		}
		
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		
		for(WebElement option:allSelectedOptions)
		{
			System.out.println(option.getText());
		}
	}
	
	

}
