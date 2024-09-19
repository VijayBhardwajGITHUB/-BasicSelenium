package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.snapdeal.com/");
	    WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(signin).perform();
	    Thread.sleep(3000); //without thread.sleep elementnotinterceable exception coming
	    driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
	}

} //ratna padega or explicit wait laga kar dekhna h free time me
