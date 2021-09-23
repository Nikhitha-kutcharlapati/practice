Feature: Register Action
    Description: This feature will test the register functionality

  Scenario: Validation of myAccount dropdown with respect to register
    Given User is on home page
    When User clicks on MyAccount dropdown
    And Click on register
    Then System should navigate to register page

  Scenario: Register with valid Credentials
    Given Open browser and registerpage of democart
    When User enter "<firstname>" in the firstname input
    And User enter "<lastname>" in the lastname input
    And User enter "<emailaddress>" in the email input
    And User enter "<telephone-no"> in telephone input
    And User enter "<password>" in the password input
    And User enter "<password>" in the password confirmation input
    And User subscribe/unsubscribe the news letter
    And User agrees to privacy policy
    And User clicks on continue button
    Then User should get signedin


  Scenario: Register with invalid firstname and lastname
    Given User is on registerpage
    When User enter invalid "<firstname>"  "<lastname>"  "<emailaddress>"  "<telephone-no>" "<password>"  "<password>" in the inputs
    And User subscribe/unsubscribe the news letter button
    And User agrees to  the privacy policy
    And User click on button to continue
    Then registraion fails and error messages displayed

  Scenario: uncheck the privacy policy
    Given User is on registerpage of application
    When User enter valid "<firstname>"  "<lastname>"  "<emailaddress>"  "<telephone-no>" "<password>"  "<password>" in the inputs
    Then User clicks on continue button for register
    Then registraion fails and Warning displayed

  Scenario: Warning for email
    Given System is on opencart registerpage
    When User enter valid values "<firstname>"  "<lastname>"
    And invalid "<emailaddress>" in email input field
    And valid values of  "<telephone-no"> "<password>"  "<password>" in the input fields
    Then User click on continue button 
    Then registration fails and Warning for mail is displayed
    
    Scenario: If user have an account already
    Given User is on democart application register page
    When User already have an account _ click on login
    Then User redirects to login page 
