package scrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithCoordinates {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in/");
	    WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
	    Point coOrd = careers.getLocation();
	    int x = coOrd.getX();
	    int y = coOrd.getY();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy("+x+","+y+")");
	    js.executeScript("arguments[0].click();",careers);

	}

}
