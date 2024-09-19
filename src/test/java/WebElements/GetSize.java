package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {

	public static void main(String[] args) {
		 WebDriverManager.edgedriver().setup();
		    WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		    driver.get("https://www.facebook.com/");
		    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		    Dimension size = email.getSize();
		   int h = size.getHeight();
		   int w = size.getWidth();	
		   System.out.println(h);
		   System.out.println(w);
		    
		    
	}

}
