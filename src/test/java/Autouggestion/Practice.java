package Autouggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.com/");
    driver.switchTo().activeElement().sendKeys("Testing");
    WebElement allsug = driver.findElement(By.xpath("((//ul[@role='listbox'])[1]//li)[3]"));
    
System.out.println(allsug.getText());;
   
    

}}
