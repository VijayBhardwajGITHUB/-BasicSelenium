package newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable  {
   WebDriverManager.edgedriver().setup();
   WebDriver driver=new EdgeDriver();
   Thread.sleep(3000);
   driver.manage().window().maximize();
   Thread.sleep(3000);
   driver.get("https://www.facebook.com/");
   System.out.println(driver.getTitle());
   System.out.println(driver.getCurrentUrl());
   Thread.sleep(2000);
   driver.quit();
   
   
   
   
   
   
   
	}

}
