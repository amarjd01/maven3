Feature: Reports

Scenario Outline: To validate Reports-Country sales page
Given user open Chrome Browser
When user launch URL as "https://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" password as "admin"
And user clicks on login button
Then page title should be "Dashboard / nopCommerce administration"
When user click on Reports menu
And user click on Country-Sales button
Then user can see Reports page with title as "Country sales / nopCommerce administration" page
When customer enters info startDate as "<StartDate>" and endDate as "4/20/2023"
And user select orderStatus as "" and payment Status as ""
And user click on RunReport button
And user close the browser

Examples:
|StartDate     |
|2/2/2023      |
|3/3/2023      |