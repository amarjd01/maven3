Feature: Admin

@Smoke
Scenario: To validate login page with valid credentials
Given user open Chrome Browser
When user launch URL as "https://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" password as "admin"
And user clicks on login button
Then page title should be "Dashboard / nopCommerce administration"
And user close the browser


@Sanity
Scenario Outline: To validate login page with valid credentials
Given user open Chrome Browser
When user launch URL as "https://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" password as "admin"
And user clicks on login button
Then page title should be "Dashboard / nopCommerce administration"
And user close the browser


Examples:
|email                 |  password   |
|admin@yourstore.com   |admin        |
|admin@yourstore.com   |admin1234    |
|admin@yourstoree.com  |admin1234    |
