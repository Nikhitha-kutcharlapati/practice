Feature: Login Action
    Description: This feature will test a LogIn functionality

  Scenario: Login with valid username and password
    Given Open chrome and navigate to login page
    When User enters valid "<username>" and "<password>"
    And Click on login button
    Then User should get logged in
