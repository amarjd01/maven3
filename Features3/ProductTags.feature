Feature: Catalog-ProductTags

Scenario: To validate Catalog-Product tags page
Given user open Chrome Browser
When user launch URL as "https://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" password as "admin"
And user clicks on login button
Then page title should be "Dashboard / nopCommerce administration"
When user click on Catalog menu
And user click on Product-Tags button
Then user can see Product-tags page with title as "Product tags / nopCommerce administration" page
When user enters tag name as "cool"
And user click on Search button
Then tagged product should be shown integer value as "17"
And user close the browser