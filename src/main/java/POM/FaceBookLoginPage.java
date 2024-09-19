package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(name="pass")
	private WebElement passwordTF;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	
	public FaceBookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
	
	public void emailTextfield(String data) {
		emailTF.sendKeys(data);
	}
	
	public void passwordTextfield(String data) {
		 passwordTF.sendKeys(data);
    }
	
	public void loginButton() {
		loginBtn.click();
	}
	

}
