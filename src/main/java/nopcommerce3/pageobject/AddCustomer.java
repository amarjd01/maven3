package nopcommerce3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	public WebDriver ldriver;
	public AddCustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElements
	By customerMenu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By customerMenuItem = By.xpath("//p[text()=' Customers']");
	By addNewButton = By.xpath("//a[@class='btn btn-primary']");
	By eMail = By.xpath("//input[@id='Email']");
	By pass = By.id("Password");
	By fName = By.id("FirstName");
	By lName = By.id("LastName");
	By genderMale = By.id("Gender_Male");
	By genderFemale = By.id("Gender_Female");
	By dOB = By.id("DateOfBirth");
	By companyName = By.id("Company");
	By adComment = By.id("AdminComment");
	By saveButton = By.xpath("//button[@name='save']");
	
	//Methods
	
	public String getTitle() {
		return ldriver.getTitle();
	}
	
	public void clickOnCustomerMenu() {
		ldriver.findElement(customerMenu).click();
	}
	
	public void clickOnCustomerMenuItem() {
		ldriver.findElement(customerMenuItem).click();
	}
	
	public void clickOnAddNewButton() {
		ldriver.findElement(addNewButton).click();
	}
	
	public void enterMailPassword(String gmail, String pwd) {
		ldriver.findElement(eMail).sendKeys(gmail);
		ldriver.findElement(pass).sendKeys(pwd);
	}
	
	public void enterFnameLname(String fname, String lname) {
		ldriver.findElement(fName).sendKeys(fname);
		ldriver.findElement(lName).sendKeys(lname);
	}
	
	public void clickOnGender(String gender) {
		if(gender.equals("Male")) {
			ldriver.findElement(genderMale).click();
		}else {
				ldriver.findElement(genderFemale).click();
			
		}
	}
	
	public void enterCompanyName(String cname) {
		ldriver.findElement(companyName).sendKeys(cname);
	}
	
	public void enterComment(String comm) {
		ldriver.findElement(adComment).sendKeys(comm);
	}
	
	public void clickOnSaveButton() {
		ldriver.findElement(saveButton).click();
	}	
	
}
