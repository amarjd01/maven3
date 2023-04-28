package nopcommerce3.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage3 {
	
	public WebDriver ldriver;
	public AdminPage3(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id = "Email")
	WebElement txtMail;
	
	@FindBy(id = "Password")
	WebElement txtPass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;
	
	public void enterMail(String uMail) {
		txtMail.clear();
		txtMail.sendKeys(uMail);
	}
	
	public void enterPass(String uPass) {
		txtPass.clear();
		txtPass.sendKeys(uPass);
	}
	
	public void login() {
		btnLogin.click();
	}

}
