package nopcommerce3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportsPage {
	
	public WebDriver ldriver;
	public ReportsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElements
	
	By btnReports = By.xpath("//a[@href='#']//p[contains(text(),'Reports')]");
	By btnCSales = By.xpath("//a[@href='/Admin/Report/CountrySales']");
	By btnStartDate = By.xpath("//input[@id='StartDate']");
	By btnEndDate = By.xpath("//input[@id='EndDate']");
	By txtBoxOrderStatus = By.xpath("//select[@id='OrderStatusId']");
	By txtBoxPaymentStatus = By.xpath("//select[@id='PaymentStatusId']");
	By btnRunReports = By.xpath("//button[@id='search-countryreport']");
	
	
	//methods
	
	public void getTitle() {
		ldriver.getTitle();
	}
	
	public void clickOnReports() {
		ldriver.findElement(btnReports).click();
	}
	
	public void clickOnCSales() {
		ldriver.findElement(btnCSales).click();
	}
	
	public void startDate(String sdate) {
		ldriver.findElement(btnStartDate).sendKeys(sdate);
	}
	
	public void endDate() {
		ldriver.findElement(btnEndDate).sendKeys("4/20/2023");
	}
	
	public void clickOnOrderStatus() {
		WebElement oS = ldriver.findElement(txtBoxOrderStatus);
		Select order = new Select(oS);
		order.selectByVisibleText("Complete");	
	}
	
	public void clickOnPaymentStatus() {
		WebElement pS = ldriver.findElement(txtBoxPaymentStatus);
		Select payment = new Select(pS);
		payment.selectByVisibleText("Paid");	
	}
	
	public void clickOnRunReports() {
		ldriver.findElement(btnRunReports).click();
		
	}
	

}
