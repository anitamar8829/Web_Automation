Feature: Login functionality for Saucedemo

  # Positive scenario
  Scenario: User login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And clicks the login button
    Then the user should be redirected to the inventory page

  # Negative scenarios
  Scenario: Login with empty credentials
    Given the user is on the login page
    When the user leaves username and password fields blank
    And clicks the login button
    Then an error message should be displayed

  Scenario: Login with invalid username and password
    Given the user is on the login page
    When the user enters an invalid username and invalid password
    And clicks the login button
    Then an error message should be displayed
