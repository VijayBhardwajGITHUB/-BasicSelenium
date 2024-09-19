package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_Partiallinktest {

	public static void main(String[] args) throws Throwable {
    WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("Vijay");
    driver.findElement(By.name("pass")).sendKeys("Bhardwaj");
    Thread.sleep(3000);
   // driver.findElement(By.linkText("Forgotten password?")).click();
    driver.findElement(By.partialLinkText("Forgotten")).click();
    driver.quit();
    
	}

}
