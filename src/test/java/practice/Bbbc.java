package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbbc {

	public static void main(String[] args) {

		  WebDriver driver=new ChromeDriver();
		    driver.get("https://www.bbc.com/");

		    // Find the "News" link in the top menu and click on it
		    WebElement newsLink = driver.findElement(By.xpath("//a[@href='/news']"));
		    newsLink.click();

		    // Find the "Business" section in the news menu and click on it
		    WebElement businessLink = driver.findElement(By.xpath("//a[@href='/news/business']"));
		    businessLink.click();

		    // Find all the news articles in the business section
		    List<WebElement> newsArticles = driver.findElements(By.xpath("//h3[contains(@class, 'gel-pica-bold')]"));

		    // Print the titles of the news articles
		    System.out.println("Latest Business News on BBC:");

		    for (WebElement article : newsArticles) {
		        System.out.println(article.getText());
		    }

		    // Close the browser
		    driver.quit();
			}

	
	
	
	
	
	
	
	

}
