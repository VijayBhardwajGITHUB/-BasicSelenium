import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("");
	}

}
