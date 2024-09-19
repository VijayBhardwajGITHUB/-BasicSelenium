package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Decathlon {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    driver.get("https://www.decathlon.in/");
	   WebElement search = driver.findElement(By.xpath("(//span[text()='Search for  '])[1]"));
	   // WebElement search = driver.findElement(By.xpath("input[@type='search']"));
	    wait.until(ExpectedConditions.visibilityOf(search));
	    search.sendKeys("Bags");
	    search.click();
	    
	}

}
	