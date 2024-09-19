package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.facebook.com/");
	   WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	    if (btn.isEnabled()) {
	    btn.click();
	    System.out.println("pass");
	   	    
			
		} else {
			System.out.println("fail");

		}
	}

}
