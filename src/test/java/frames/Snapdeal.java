package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.snapdeal.com/");
	    WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(signIn).perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='login']")).click();
	    //driver.switchTo().frame("loginIframe");
	    driver.switchTo().frame("iframeLogin");
	    driver.findElement(By.id("userName")).sendKeys("Vijay");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='close-pop']")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("cloths");
	    }

}
