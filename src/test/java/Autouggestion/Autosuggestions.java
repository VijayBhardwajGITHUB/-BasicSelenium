package Autouggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.com/");
    driver.switchTo().activeElement().sendKeys("Java");
    List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
    int count = allsug.size();  
    System.out.println(count);
    for(int i=0;i<count;i++) {
    	String text = allsug.get(i).getText();
    	System.out.println(text);
    }
   System.out.println(allsug.get(4).getText());;
   
    
	}

}
