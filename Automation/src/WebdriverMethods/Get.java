package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to set the size of  window
		Dimension d = new Dimension(1003, 784);
		driver.manage().window().setSize(d);
		
		//to set the position of window
		Point p = new Point(100, 50);
		driver.manage().window().setPosition(p);
		
		//to launch the web application
		driver.get("https://www.facebook.com/");
		//to get the title
		String actual_title = driver.getTitle();
		String expected_title= "Facebook – log in or sign up";
		
		if(actual_title.equals(expected_title))
			System.out.println("Login page is displayed");
		else
			System.out.println("Login page is not displayed");
		
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getPosition());
		
		
		
		
		
		
		
		
		
	}

}
