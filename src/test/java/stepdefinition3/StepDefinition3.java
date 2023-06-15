package stepdefinition3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.mustache.Value;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import nopcommerce3.pageobject.AddCustomer;
import nopcommerce3.pageobject.AdminPage3;
import nopcommerce3.pageobject.Catalog;
import nopcommerce3.pageobject.ProductTags;
import nopcommerce3.pageobject.ReportsPage;

public class StepDefinition3 extends Base3 {
	
	@Given("user open Chrome Browser")
	public void user_open_chrome_browser() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);
		
		ap3 = new AdminPage3(driver);	
		addCust = new AddCustomer(driver);
		rP = new ReportsPage(driver);
		ctl = new Catalog(driver);
		pt = new ProductTags(driver);

	}

	@When("user launch URL as {string}")
	public void user_launch_url_as(String URL) throws Exception {
		driver.get(URL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    
	}
	
	@When("user enters email as {string} password as {string}")
	public void user_enters_email_as_password_as(String mail, String pass) throws Exception {
		ap3.enterMail(mail);
		Thread.sleep(2000);
		ap3.enterPass(pass);
		Thread.sleep(2000);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws Exception {
		ap3.login();
		Thread.sleep(2000);
	   
	}
	
	@SuppressWarnings("deprecation")
	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws Exception {
		Assert.assertEquals(title, driver.getTitle());
	    Thread.sleep(2000);
	}
	
	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws Exception {
		addCust.clickOnCustomerMenu();
		Thread.sleep(2000);	    
	}

	@Then("user click on customers button")
	public void user_click_on_customers_button() throws Exception {
		addCust.clickOnCustomerMenuItem();
		Thread.sleep(2000);
	    
	}

	@Then("user click on AddNew button")
	public void user_click_on_add_new_button() throws Exception {
		addCust.clickOnAddNewButton();
		Thread.sleep(2000);
	    
	}

	@Then("user can see add new customer page")
	public void user_can_see_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getTitle());
	    
	}

	@When("customer enters info as {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void customer_enters_info_as_and_and_and_and_and_and(String gmail, String pwd, String fname, String lname, String cname, String gender, String comm) throws Exception {
	    addCust.enterMailPassword(gmail, pwd);
	    Thread.sleep(2000);
	    addCust.enterFnameLname(fname, lname);
	    Thread.sleep(2000);
	    addCust.clickOnGender(gender);
	    addCust.enterCompanyName(cname);
	    Thread.sleep(2000);
	    addCust.enterComment(comm);
	    Thread.sleep(2000);


	}

	@When("user click on save button")
	public void user_click_on_save_button() throws Exception {
		addCust.clickOnSaveButton();
	    Thread.sleep(2000);

	    
	}

	@Then("user can see confirmation msg as {string}")
	public void user_can_see_confirmation_msg_as(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	   
	} 
	
	@When("user click on Reports menu")
	public void user_click_on_reports_menu() throws Exception {
	   rP.clickOnReports();
	   Thread.sleep(2000);
	}

	@When("user click on Country-Sales button")
	public void user_click_on_country_sales_button() throws Exception {
	    rP.clickOnCSales();
	    Thread.sleep(2000);
	}

	@Then("user can see Reports page with title as {string} page")
	public void user_can_see_reports_page_with_title_as_page(String title) throws Exception {
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(2000);
	}
	
	@When("customer enters info startDate as {string} and endDate as {string}")
	public void customer_enters_info_start_date_as_and_end_date_as(String sdate, String string2) throws Exception {
		rP.startDate(sdate);
		Thread.sleep(2000);
		rP.endDate();
	    Thread.sleep(2000);
	}

	@When("user select orderStatus as {string} and payment Status as {string}")
	public void user_select_order_status_as_and_payment_status_as(String string, String string2) throws Exception {
		rP.clickOnOrderStatus();
		Thread.sleep(2000);
		rP.clickOnPaymentStatus();
		Thread.sleep(2000);
	    
	}

	
	@When("user click on RunReport button")
	public void user_click_on_run_report_button() throws Exception {
		rP.clickOnRunReports();
		Thread.sleep(2000);
	    
	} 
	
	
	@When("user click on Catalog menu")
	public void user_click_on_catalog_menu() throws Exception {
		ctl.clickOnCatalog();
		Thread.sleep(2000);
	    
	}

	@When("user click on Manufacturers button")
	public void user_click_on_manufacturers_button() throws Exception {
		ctl.clickOnManuf();
		Thread.sleep(2000);
	    
	}
	
	@Then("user can see Manufacturers page with title as {string} page")
	public void user_can_see_manufacturers_page_with_title_as_page(String title) throws Exception {
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(2000);
	    
	}

	@When("user enters manufacturers name as {string}")
	public void user_enters_manufacturers_name_as(String manu) throws Exception {
		ctl.enterTextInManuf(manu);
		Thread.sleep(2000);
	    
	}

	@When("user select published as {string}")
	public void user_select_published_as(String publ) throws Exception {
		ctl.enterTextInPublish(publ);
		Thread.sleep(2000);
	    
	}

	@When("user click on Search button")
	public void user_click_on_search_button() throws Exception {
		ctl.search();
		Thread.sleep(2000);
	   
	}

	@Then("Display Order should be shown as {string}")
	public void display_order_should_be_shown_as(String v) {
		Assert.assertEquals(v, ctl.hpValue());
	    
	}	
	

/*	@When("user click on Product-Tags button")
	public void user_click_on_product_tags_button() throws Exception {
	    pt.clickOnProductTags();
	    Thread.sleep(2000);
	}

	@Then("user can see Product-tags page with title as {string} page")
	public void user_can_see_product_tags_page_with_title_as_page(String title) throws Exception {
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(2000);
	    
	}

	@When("user enters tag name as {string}")
	public void user_enters_tag_name_as(String xyz) throws Exception {
	    pt.enterTextInSearchBox(xyz);
	    Thread.sleep(2000);
	}

	@When("user click on Search button")
	public void user_click_on_search_button() throws Exception {
	    pt.clickOnSearch();
	    Thread.sleep(2000);
	}

	@Then("tagged product should be shown integer value as {string}")
	public void tagged_product_should_be_shown_integer_value_as(String value) {
		Assert.assertEquals(pt.productTagsValue(), value);
	    
	} */
	
	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.close();
		    
	}

}
