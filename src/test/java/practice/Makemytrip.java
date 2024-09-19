package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();
	    driver.findElement(By.xpath("//span[text()='Departure']")).click();
	     String dm = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	  // String edm = driver.findElement(By.xpath("(//div[text()='November 2024'])")).getText();
	    
	    
	    
	    while( !(dm.equals("November 2024")))
	    	{
	    	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	      dm=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		// edm= driver.findElement(By.xpath("(//div[text()='November 2024'])")).getText();
		  
	    	
	    	
			
		}
	    driver.findElement(By.xpath("//div[@aria-label='Fri Nov 29 2024']")).click();
	}}

