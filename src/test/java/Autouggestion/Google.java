package Autouggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable {
    WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("phone");
    Thread.sleep(3000);
    List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(),'phone')]"));
    Thread.sleep(3000);
    for(WebElement b:autosuggestions) {
    System.out.println(b.getText());
    }
    
	}

}
