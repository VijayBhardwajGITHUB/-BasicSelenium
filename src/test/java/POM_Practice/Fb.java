package POM_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.cFBLoginPage;

public class Fb {

	public static void main(String[] args) {
     
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://www.facebook.com/");
		    cFBLoginPage lp=new cFBLoginPage(driver);
		    lp.loginToPage("vijay", "bhardwaj");
	}

}
