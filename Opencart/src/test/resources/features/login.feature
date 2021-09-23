Feature: Login Action
    Description: This feature will test a LogIn functionality

  Scenario: Validation of myAccount dropdown with respect to login
    Given Openchrome and start the application
    When User clicks on MyAccount dropdown
    And Click on login
    Then System should navigate to login page

  @valid
  Scenario: Login with valid username and password
    Given Open chrome and navigate to login page
    When User enters valid "<username>" and "<password>"
    And Click on login button
    Then User should get logged in

  @invalid
  Scenario Outline: Validate login with invalid data
    Given Open chrome browser and navigate to login page
    When Enter invalid credentials in "<username>" and "<password>" fields
    And Click on login button for login
    Then It should display error message

    Examples: 
      | username | password |
      | user1    | hello    |

  Scenario: Validation of forgot password link
    Given User is on login page
    When User clicks on forget password link
    Then System navigates to Forgot password page
