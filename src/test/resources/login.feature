@login
Feature: Login

  @valid-login
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
    Then user able to see error message

    @Logout-User
    Scenario: User logout apps
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      When user click login button
      Then User clik button menu
      Then user Click textlink Logout
      When verifikasi page Login

    @Home-Page
    Scenario: User is stay homepage
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      When user click login button
      Then user is on homepage
      And user at page with "Products"
      And Verifikasi product awal Highlight
      And ver product kedua Highlight
      And Ver product ketiga Highlight
      Then Ver product kelima Highlight
      And able logo shopping

  @add-cart
  Scenario: Add cart items
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    When addcart-backpack
    Then addcart-bike
    Then addcart-jacket
    Then addcart-tshirt

    @remove-cart
    Scenario: Remove items in cart
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      When user click login button
      When addcart-backpack
      And Remove cart backpack
      Then addcart-jacket
      Then Remove item in cart Jacket
      Then addcart-tshirt
      And Remove cart T-shirt

      @Menu-cart
      Scenario: User look items in menu cart
        Given user is on login page
        And user input username with "standard_user"
        And user input password with "secret_sauce"
        When user click login button
        Then view item in cart
        And verifikasi page cart