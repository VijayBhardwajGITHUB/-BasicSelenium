package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DoubleClick {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoapp.skillrary.com/product.php?poduct=java");
	   WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	  //WebElement plusgn = driver.findElement(By.xpath("//button[@id='add']"));
	    //Thread.sleep(3000);

        Actions a=new Actions(driver);
	    a.doubleClick(plus).perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	    
	}

}
