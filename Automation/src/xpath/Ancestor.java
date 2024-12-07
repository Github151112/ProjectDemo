package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestor {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/cn/milk/cid/14/922");
		
		
		Thread.sleep(3000);
		
		WebElement addToCart = driver.findElement(By.xpath("//div[text()='Amul Taaza Toned Fresh Milk']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']"));
		addToCart.click();
	}

}
