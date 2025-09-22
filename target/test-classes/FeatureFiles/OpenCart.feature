Feature: Test OpenCart application

  @register
  Scenario: Test register functionality with valid credentials
    Given Open Register page of application
    When user enter all required valid fields
      | fname | lname | email            | telephone | password | cpassword |
      | Kirti | Gurav | kirtig@gmail.com |   8998999 | test123  | test123   |
    When User click on yes radio button
    When User click on Privacy policy checkbox
    When User click on Continue button
    Then User should be register and get valid message

  @login
  Scenario: Test login for newly register user
    Given Open Opencart login page
    When user send all valid credentials
      | kirtig@gmail.com | test123 |
    When User click on Login button of cart page
    Then User should be able to login and navigate to account page
