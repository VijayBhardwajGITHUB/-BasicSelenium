import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class AmazonEx {

	public static void main(String[] args) {
		
    WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    
    driver.get("https://www.amazon.in/");
    
    driver.manage().window().maximize();
    driver.findElement(By.name("field-keywords")).sendKeys("PUMA");
	}

}
