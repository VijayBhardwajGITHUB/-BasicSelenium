package Autouggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIP {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.name("q")).sendKeys("Apple iPhone 14 Pro Max",Keys.ENTER);
	    //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//   List<WebElement> phone = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]"));
	  //List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
	    //List<WebElement> mob = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]/../..//div[@class=\"_30jeq3 _1_WHN1\"]"));
	    List<WebElement> mob = driver.findElements(By.xpath("//div[@class=\'_4rR01T\']/../..//div[@class=\'_30jeq3 _1_WHN1\']"));

	    int count = mob.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++) {
	    	String p = mob.get(i).getText();
	    	System.out.println("Apple iPhone 14 Pro Max----->" + p);
	    }
	   
	   
	    
	    }

}
