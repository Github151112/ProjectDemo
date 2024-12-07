package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String actual_url = driver.getCurrentUrl();
		String expected_Url = "https://www.flipkart.com/";
	
		
		if(actual_url.equals(expected_Url))
			System.out.println("I am getting welcome page");
		else
			System.out.println("I am not getting welcome page");
		
	}

}
