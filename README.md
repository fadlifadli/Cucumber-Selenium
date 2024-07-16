## Cucumber-Selenium 
## Scenario with apps saucedemo.com
- language JAVA
- Framework Selenium
- Method POM
- Build automation Gradle
- Scenario language with Gherkin




## 1. valid-login
### Scenario: 
1. Login using valid email and password
2. Given user is on login page
3. And user input username with "standard_user"
4. And user input password with "secret_sauce"
5. When user click login button
6. Then user is on homepage


## 2. invalid-login
### Scenario: 
1. Login using invalid email and password
2. Given user is on login page
3. And user input username with "standard_user"
4. And user input password with "invalid"
5. When user click login button 
6. Then user able to see error message Epic sadface: Username and password do not match any user in this service

## 3. Logout-User
### Scenario: User logout apps
1. Given user is on login page
2. And user input username with "standard_user"
3. And user input password with "secret_sauce"
4. When user click login button 
5. Then User clik button menu 
6. Then user Click textlink Logout 
7. When verifikasi page Login

## 4. Home-Page
### Scenario: User is stay homepage
1. Given user is on login page 
2. And user input username with "standard_user"
3. And user input password with "secret_sauce"
4. When user click login button 
5. Then user is on homepage 
6. And user at page with "Products"
7. And Verifikasi product awal Highlight 
8. And ver product kedua Highlight 
9. And Ver product ketiga Highlight 
10. Then Ver product kelima Highlight 
11. And able logo shopping

## 5. add-cart
### Scenario: Add cart items
1. Given user is on login page 
2. And user input username with "standard_user"
3. And user input password with "secret_sauce"
4. When user click login button 
5. When addcart-backpack 
6. Then addcart-bike 
7. Then addcart-jacket 
8. Then addcart-tshirt

## 6. remove-cart
### Scenario: Remove items in cart
1. Given user is on login page 
2. And user input username with "standard_user"
3. And user input password with "secret_sauce"
4. When user click login button 
5. When addcart-backpack 
6. And Remove cart backpack 
7. Then addcart-jacket 
8. Then Remove item in cart Jacket 
9. Then addcart-tshirt 
10. And Remove cart T-shirt

## 7. Menu-cart
### Scenario: User look items in menu cart
1. Given user is on login page 
2. And user input username with "standard_user"
3. And user input password with "secret_sauce"
4. When user click login button 
5. Then view item in cart 
6. And verifikasi page cart

##### Reports cucumber berupa Html 
[iniya...](https://github.com/fadlifadli/Cucumber-Selenium/blob/master/reports/cucumber.html)
##### Reports cucumber berupa json 
[iniya...](https://github.com/fadlifadli/Cucumber-Selenium/blob/master/reports/cucumber.json)