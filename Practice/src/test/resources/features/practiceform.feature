Feature: Practice Action
    Description: This feature will test the form functionality

  Scenario: automate the form
    Given Open browser and selenium practice form
    When User enter "<firstname>" in the firstname input
    And User enter "<lastname>" in the lastname input
    And User select gender
    And User select years of experience
    And User enter "<date>" in the date input field
    And User selects the profession
    And User selects the automation tools
    And User selects the continents
    And User selects the selenium commands
    And User uploads image
    And user download the file'
    And user clicks on submit button
    Then the data gets submitted