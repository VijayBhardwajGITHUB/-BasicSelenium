package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class singleselect {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in/");
	    WebElement dD = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    Select s =new Select(dD);
	    s.selectByIndex(4);
	    Thread.sleep(3000);
	    s.selectByValue("search-alias=amazon-devices");
	    Thread.sleep(3000);
	    s.selectByVisibleText("Beauty");
	    Thread.sleep(3000);
	    System.out.println(s.isMultiple());
	    List<WebElement> dDvalues = s.getOptions();
	    System.out.println(dDvalues.size());
	    for(WebElement o:dDvalues) {
	    	System.out.println(o.getText());
	    }
	}

}
