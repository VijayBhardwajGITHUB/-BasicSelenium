
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Bhardwaj");
		//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create a')]")).click();
		
	
	}

}
