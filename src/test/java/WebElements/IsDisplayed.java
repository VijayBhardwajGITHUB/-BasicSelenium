package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		 
		    WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://www.facebook.com/");
		    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		    if (email.isDisplayed()) {
		    email.sendKeys("vijay");
		    System.out.println("pass");
		   	    
				
			} else {
				System.out.println("fail");

			}
	}

}
