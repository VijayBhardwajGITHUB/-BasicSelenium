package Autouggestion;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.amazon.in/");
		   List<WebElement> als = driver.findElements(By.xpath("//a"));
		   int count = als.size();
		   System.out.println(count);
		   for(int i=0;i<count;i++) {
			   String text = als.get(i).getText();
			   System.out.println(text);
		   }
		   driver.close();
	}

}
