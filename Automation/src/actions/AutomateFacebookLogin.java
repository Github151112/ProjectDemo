package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {
	public static void main(String[] args) {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to open the application
		driver.get("https://www.facebook.com");
		// enter the email
		driver.findElement(By.name("email")).sendKeys("AmanSingh");
		driver.findElement(By.name("pass")).sendKeys("jcbhjdsbchbcd");
		driver.findElement(By.name("login")).click();
	}
}
