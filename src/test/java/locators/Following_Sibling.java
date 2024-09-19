package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Following_Sibling {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.xpath("//a[text()='Mobiles']/following-sibling::a[@data-csa-c-slot-id='nav_cs_5']")).click();
	    
	}

}