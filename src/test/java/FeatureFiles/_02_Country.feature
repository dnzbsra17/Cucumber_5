Feature: Country Functionality
  @SmokeTest
  Scenario: Create Country
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully
    And Navigate to Country page
    When Create a Country
    Then Success mesasage should be displayed