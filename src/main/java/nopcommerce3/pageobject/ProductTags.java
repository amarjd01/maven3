package nopcommerce3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductTags {
	
	public WebDriver ldriver;
	public ProductTags(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Web Elements
	By btnPTags = By.xpath("//a[@href='/Admin/Product/ProductTags']");
	By txtBoxSearchTags = By.id("SearchTagName");
	By btnSearch = By.id("search-product-tags");
	By textProductTags = By.xpath("//table[@id= 'product-tags-grid']/tbody/tr[1]/td[3]");
	
	//Methods
	
	public void clickOnProductTags() {
		ldriver.findElement(btnPTags).click();
	}
	
	public void enterTextInSearchBox(String tags) {
		ldriver.findElement(txtBoxSearchTags).sendKeys(tags);
	}
	
	public void clickOnSearch() {
		ldriver.findElement(btnSearch).click();
	}
	
	public String productTagsValue() {
		String pValue = ldriver.findElement(textProductTags).getText();
		return pValue;
	}

}
