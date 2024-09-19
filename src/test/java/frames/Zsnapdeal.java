package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zsnapdeal {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.snapdeal.com/");
    WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
    Actions a=new Actions(driver);
    a.moveToElement(signIn).perform();
    driver.findElement(By.xpath("//a[text()='login']")).click();
    driver.switchTo().frame("loginIframe");
    driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("abcd");
    driver.findElement(By.xpath("//div[@id='close-pop']")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("mobiles");
    
	}
}
