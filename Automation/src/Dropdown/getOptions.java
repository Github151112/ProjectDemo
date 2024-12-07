package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	    WebElement dropdown = driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
	    
	    Select s= new Select(dropdown);
//	    System.out.println(s.isMultiple());
//	    List<WebElement> alloptions = s.getOptions();
//	    
//	    for(WebElement option:alloptions)
//	    {
//	    	System.out.println(option.getText());
//	    }
//	    
	    //getfirstselected
//	    for(int i=0;i<3;i++)
//	    {
//	    	s.selectByIndex(i);
//	    }
//	    WebElement firstoption = s.getFirstSelectedOption();
//	    System.out.println(firstoption.getText());
//	    
	    //getallselectedoptions
//	    for(int i=0;i<4;i++)
//	    {
//	    	s.selectByIndex(i);
//	    }
//	    List<WebElement> allselectedoptions = s.getAllSelectedOptions();
//	    for(WebElement option:allselectedoptions)
//	    {
//	    	System.out.println(option.getText());
//	    }
	    //getwrappedElement
	    
	    System.out.println(s.isMultiple());
	    WebElement alloptions = s.getWrappedElement();
	     System.out.println(alloptions.getText());    
	    
	}

}
