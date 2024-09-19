package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoapp.skillrary.com/");
	    WebElement dD = driver.findElement(By.xpath("//select[@id='cars']"));
	    Select s=new Select(dD);
	    s.selectByIndex(0);
	    Thread.sleep(3000);
	    s.selectByValue("199");
	   /* Thread.sleep(3000);
	   // s.selectByVisibleText("More Than INR 500 ( 55 ) ");
	    //Thread.sleep(3000);
	    System.out.println(s.isMultiple());
	    s.deselectByIndex(0);
	    Thread.sleep(3000);
	    s.deselectByValue("199");
	    Thread.sleep(3000);*/
	    //s.deselectByVisibleText("More Than INR 500 ( 55 ) ");
	   // Thread.sleep(3000);
	    List<WebElement> selectedvalues = s.getAllSelectedOptions();
	    for(WebElement b:selectedvalues) {
	    	System.out.println(b.getText());
	    }
	    
	    		
	}

}
