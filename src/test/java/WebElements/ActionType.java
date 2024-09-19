package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionType {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.get("https://www.facebook.com/");
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("vijay");
	    Thread.sleep(3000);
	    email.clear();
	    driver.findElement(By.xpath("//button[@type='submit']")).submit();  

	}

}
