package takingScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com");
		
		WebElement burger = driver.findElement(By.xpath("//img[@alt='restaurants curated for burger']"));
		File src = burger.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/burger.png");
		Files.copy(src, dest);
		
	}

}
