# Cucumber-Selenium

# Scenario saucedemo.com
## @login
Feature: Login

### @valid-login
Scenario: Login using valid email and password
Given user is on login page
And user input username with "standard_user"
And user input password with "secret_sauce"
When user click login button
Then user is on homepage

@invalid-login
Scenario: Login using invalid email and password
Given user is on login page
And user input username with "standard_user"
And user input password with "invalid"
When user click login button
Then user is on login page
###    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"


# Reports cucumber berupa Html 
(iniya...)[https://github.com/fadlifadli/Cucumber-Selenium/blob/master/reports/cucumber.html]
# Reports cucumber berupa json 
(iniya...)[https://github.com/fadlifadli/Cucumber-Selenium/blob/master/reports/cucumber.json]