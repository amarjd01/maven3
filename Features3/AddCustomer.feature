Feature: Add Customer

Scenario Outline: To validate add customer page with valid credentials
Given user open Chrome Browser
When user launch URL as "https://admin-demo.nopcommerce.com/login"
And user enters email as "admin@yourstore.com" password as "admin"
And user clicks on login button
Then page title should be "Dashboard / nopCommerce administration"
When user click on customers menu
And user click on customers button
And user click on AddNew button
Then user can see add new customer page
When customer enters info as "<Email>" and "<pwd>" and "<fname>" and "<lname>" and "<gender>" and "<cname>" and "<cmnt>"
And user click on save button
Then user can see confirmation msg as "The new customer has been added successfully."
And user close the browser


Examples:
|Email                   |pwd        |fname       |lname       |gender       |cname       |cmnt     |
|amarjd03@gmail.com      |123123     |amar        |jadhav      |male         |xyz         |QA       |
|amarjd04@gmail.com      |123123     |amar        |jadhav      |female       |pqr         |tester   |