package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());
		
//		List<WebElement> allOptions = s.getOptions();
//		
//		for(WebElement options:allOptions)
//		{
//			System.out.println(options.getText());
//		}

		WebElement alloptions = s.getWrappedElement();
		System.out.println(alloptions.getText());
	}

}
