package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ParticularWebelement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot1/flipkartlogo.png");
		Files.copy(src, dest);
	}

}
