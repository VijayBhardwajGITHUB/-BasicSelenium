package locators;

public class XPath_Traversing {

	public static void main(String[] args) throws Throwable {
		 WebDriverManager.edgedriver().setup();
		    WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.get("https://www.amazon.in/s?k=itel+p55&ref=nb_sb_noss");
		    Thread.sleep(2000);
		   WebElement value = driver.findElement(By.xpath("((//span[text()='itel P55 5G (6GB RAM, 128GB ROM) Upto 12GB RAM with Memory Fusion | Dimensity 6080 | 50MP AI Dual Rear Camera | 5000mAh Battery | 2 Years Warranty | Mint Green'])[1]/../../../../..//span[@class='a-offscreen'])[1]"));
	     //driver.findElement(By.xpath("((//span[text()='itel P55 5G (6GB RAM, 128GB ROM) Upto 12GB RAM with Memory Fusion | Dimensity 6080 | 50MP AI Dual Rear Camera | 5000mAh Battery | 2 Years Warranty | Mint Green'])[1]/ancestor::div[@class='puisg-col-inner']//span[@class='a-offscreen'])[1]")).click();
		   Thread.sleep(2000);
		   System.out.println(value.getText());
	        driver.quit();
	        
	        can't print
	}

}
