package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeventhElement {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com/");
	    driver.switchTo().activeElement().sendKeys("India");
	    Thread.sleep(5000);
	    String element = driver.findElement(By.xpath("((//ul[@role='listbox'])[1]/li)[7]")).getText();
	    System.out.println(element);
	    driver.quit();
	    
	}

}
