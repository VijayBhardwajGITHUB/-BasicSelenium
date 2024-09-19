package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cFBLoginPage {
	
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(name="pass")
	private WebElement passwordTF;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	public cFBLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void loginToPage(String USERNAME, String PASSWORD) {
		emailTF.sendKeys(USERNAME);
		passwordTF.sendKeys(PASSWORD);
		loginBtn.click();
		
		
		
	}
}
