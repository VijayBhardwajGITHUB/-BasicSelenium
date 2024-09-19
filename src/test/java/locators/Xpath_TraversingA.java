package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TraversingA {

	public static void main(String[] args) throws Throwable {
			   WebDriver driver= new ChromeDriver();
			   driver.get("https://www.amazon.in/");
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("itel p55");
			   driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
			  WebElement vaule = driver.findElement(By.xpath("//span[text()='itel P55 5G (6GB RAM, 128GB ROM) Upto 12GB RAM with Memory Fusion | Dimensity 6080 | 50MP AI Dual Rear Camera | 5000mAh Battery | 2 Years Warranty | Mint Green']/../../../../..//span[@class='a-price-whole']")); 
			   System.out.println(vaule.getText());
			   driver.quit();
	}

}
