package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("Vijay",Keys.TAB,"Bhardwaj");
	    WebElement lgnbtn = driver.findElement(By.name("login"));
	    
	    //explicit wait
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(lgnbtn));
	    lgnbtn.click();
	    
	  ////////wait.until(ExpectedConditions.titleContains("Not you?"));  ?????????
	    
	    
	    FluentWait fluent = new FluentWait(driver);
	    fluent.pollingEvery(Duration.ofSeconds(1));
	    fluent.withTimeout(Duration.ofSeconds(10));
	    fluent.until(ExpectedConditions.elementToBeClickable(lgnbtn));
    
	}

}
