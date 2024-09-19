package dataDrivenTesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
    Properties p=new Properties();
    FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
    p.load(fis);
   String appUrl = p.getProperty("url");
   String user = p.getProperty("username");
   String pass = p.getProperty("password");
   String brow = p.getProperty("browser");
   WebDriver driver;
   if (brow.equals("edge")) {
	   driver=new EdgeDriver();
	
} else {
	driver=new ChromeDriver();

}

   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get(appUrl);
   driver.findElement(By.id("email")).sendKeys(user);
   driver.findElement(By.name("pass")).sendKeys(pass);
    
	}

}
