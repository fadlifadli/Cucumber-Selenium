## Cucumber-Selenium Scenario Login to saucedemo.com

### @valid-login
#### Scenario: 
1. Login using valid email and password
2. Given user is on login page
3. And user input username with "standard_user"
4. And user input password with "secret_sauce"
5. When user click login button
6. Then user is on homepage

### @invalid-login
#### Scenario: 
1. Login using invalid email and password
2. Given user is on login page
3. And user input username with "standard_user"
4. And user input password with "invalid"
5. When user click login button 
6. Then user able to see error message Epic sadface: Username and password do not match any user in this service


##### Reports cucumber berupa Html 
[iniya...](https://github.com/fadlifadli/Cucumber-Selenium/blob/master/reports/cucumber.html)
##### Reports cucumber berupa json 
[iniya...](https://github.com/fadlifadli/Cucumber-Selenium/blob/master/reports/cucumber.json)