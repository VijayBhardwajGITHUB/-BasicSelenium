package TestNG_Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assestions {
WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
        @Test
        public void login() {
        	driver.findElement(By.id("email"));
        	driver.findElement(By.id("pass"));
        	String title = driver.getTitle();
        	//Hard Assert
        	//Assert.assertEquals(title, "asdfg");
        	//Soft Assert
        	SoftAssert s=new SoftAssert();
        	s.assertEquals(title, "asdfg");
        	System.out.println(driver.getCurrentUrl());
        }
        @AfterMethod
        public void close() {
        	driver.close();
        }

}
