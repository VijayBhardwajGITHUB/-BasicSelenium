package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Actions a=new Actions(driver);
	    a.doubleClick(plus).perform();
	    driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	    Alert al= driver.switchTo().alert();
	    System.out.println(al.getText());
	    al.dismiss();

	}

}
