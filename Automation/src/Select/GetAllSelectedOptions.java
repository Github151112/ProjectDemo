package Select;

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
		
		Select s = new Select(dropdown);
		
		for(int i=0;i<4;i++)
		{
			s.selectByIndex(i);
		}
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for(int i=0;i<allSelectedOptions.size();i++)
		{
			System.out.println(allSelectedOptions.get(i).getText());
		}
		
		
	}

}
