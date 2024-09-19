package scrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZWithoutCoordinates {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/");
    WebElement careers = driver.findElement(By.linkText("Careers"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView();",careers );
    //careers.click();
    js.executeScript("arguments[0].click();",careers );
    		
	}

}
