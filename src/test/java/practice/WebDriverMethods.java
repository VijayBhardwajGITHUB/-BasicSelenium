package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		/*WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");*/
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		Thread.sleep(2000);
        String source = driver.getPageSource();
        System.out.println(source);
        
        /*Options opt = driver.manage();
        Window win = opt.window();
        win.maximize();*/
        driver.manage().window().maximize();
        
        /*Options opt = driver.manage();
        Window win = opt.window();
        win.minimize();*/
        
        driver.manage().window().minimize();
        
        driver.close();  //----> closes a single tab/window currently driver in focus
        
        //driver.quit();----> closes all the tabs/windows including browser

	}

}

