package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("vijay");
	    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Bhardwaj");
	}

}
