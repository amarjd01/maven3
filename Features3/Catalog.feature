Feature: Catalog

Scenario Outline: To validate Catalog-Manufacturers page
Given user open Chrome Browser
When user launch URL as "https://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" password as "admin"
And user clicks on login button
Then page title should be "Dashboard / nopCommerce administration"
When user click on Catalog menu
And user click on Manufacturers button
Then user can see Manufacturers page with title as "Manufacturers / nopCommerce administration" page
When user enters manufacturers name as "HP"
And user select published as ""
And user click on Search button
Then Display Order should be shown as "5"
And user close the browser