package nopcommerce3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Catalog {
	
	public WebDriver ldriver;
	public Catalog(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Web Elements
	By btnCatalog = By.xpath("//a[@href='#']//p[contains(text(),'Catalog')]");
	By btnManuf = By.xpath("//a[@href='/Admin/Manufacturer/List']");
	By txtManuf = By.id("SearchManufacturerName");
	By txtPublish = By.id("SearchPublishedId");
	By hpValue = By.xpath("//table[@id='manufacturers-grid']/tbody/tr[1]/td[4]");
	By btnSearch = By.id("search-manufacturers");
	
	//Methods
	
	public void clickOnCatalog() {
		ldriver.findElement(btnCatalog).click();
	}
	
	public void clickOnManuf() {
		ldriver.findElement(btnManuf).click();
	}
	
	public void enterTextInManuf(String manu) {
		ldriver.findElement(txtManuf).sendKeys(manu);
	}
	
	public void enterTextInPublish(String publish) {
		WebElement published = ldriver.findElement(txtPublish);
		Select p = new Select(published);
		p.selectByVisibleText("All");
	}
	
	public void search() {
		ldriver.findElement(btnSearch).click();
	}
	
	public String hpValue() {
		String value = ldriver.findElement(hpValue).getText();
		return value;
				
	}

}
