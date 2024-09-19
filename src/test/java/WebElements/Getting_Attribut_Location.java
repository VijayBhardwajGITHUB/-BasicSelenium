package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Attribut_Location {

	public static void main(String[] args) {
    WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.get("https://www.facebook.com/");
    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
    System.out.println(email.getAttribute("type"));
    //System.out.println(email.getLocation());
    Point coordinates = email.getLocation();
    int x = coordinates.getX();
    int y = coordinates.getY();
    System.out.println(x);
    System.out.println(y);
    
    
	}

}
