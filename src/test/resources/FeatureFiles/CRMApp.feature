Feature: Test CRM application

  Background: 
    Given Open CRM application
    When User click on SignIn link

  Scenario: Test SignIn link
    #When User click on SignIn link
    Then User should navigate to Login page

  Scenario: Test Login Functionality for CRM
    #When User click on SigIn link
    When User enter emailid "test@gmail.com" and password "test123"
    When User click on Submit button
    Then User should be navigate to Customers page
