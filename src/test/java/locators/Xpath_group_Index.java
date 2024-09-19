package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_group_Index {

	public static void main(String[] args) {
    WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://demoapp.skillrary.com/index.php");
    driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
	}

}
