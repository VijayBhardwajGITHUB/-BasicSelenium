package TestNG_Parallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallels {
	@Parameters({"browsername"})
	@Test
	public void fb(String browser) {
		WebDriver driver;		
	
	if(browser.equals("edge")) {
	driver=new EdgeDriver();
	}
	else if (browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");

}
}