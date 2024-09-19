package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    Thread.sleep(2000);
	   WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
	   female.click();
	   if (female.isSelected()) {
		   System.out.println("pass");
		   	    
				
			} else {
				System.out.println("fail");
			}

	}

	}
