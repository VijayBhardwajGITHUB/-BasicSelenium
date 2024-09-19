package POM_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.FaceBookLoginPage;

public class Facebook {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/");
    FaceBookLoginPage fbl=new FaceBookLoginPage(driver);
   // fbl.getEmailTF().sendKeys("vijay");
    //fbl.getPasswordTF().sendKeys("bhardwaj");
    //fbl.getLoginBtn().submit();
    fbl.emailTextfield("vijay");
    fbl.passwordTextfield("Bhardwaj");
    fbl.loginButton();
    
    
	}

}
