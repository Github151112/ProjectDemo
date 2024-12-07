package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AutomateBlinkit {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://blinkit.com/");
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		Thread.sleep(5000);
		// search some product
		driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("vegetables");
		Thread.sleep(5000);
		WebElement bhindi = driver.findElement(By.xpath("//img[@alt='Lady Finger (Bhindi)']"));
		File src = bhindi.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/bhindi.png");
		Files.copy(src, dest);
		Thread.sleep(5000);
		List<WebElement> allVegatables = driver
				.findElements(By.xpath("//div[@class='Product__UpdatedTitle-sc-11dk8zk-9 hxWnoO']"));
		driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']")).click();

		for (int i = 0; i < allVegatables.size(); i++) {
			if (driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']")).getText()
					.equals("Lady Finger (Bhindi)")) {
				break;
			}
		}

	}

}
