Feature: Test Orangehrm application

  Scenario Outline: Test Login with data driven
    Given Open hrm application
    When User enter "<username>" and "<password>"
    When User click on login button of hrm page
    Then for valid data user should be able to login and navigated to dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | pooja    | test123  |
      | Admin    | admin123 |
      | Abhay    | test123  |
