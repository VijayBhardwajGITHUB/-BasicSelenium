package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {
		
		// case1:-
            /*String key = "webdriver.chrome.driver";
            String value = "./chromedriver.exe";
             System.setProperty(key, value);
              WebDriver driver=new ChromeDriver();*/
		
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
