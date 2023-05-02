Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully
    And Navigate to Country page

  Scenario: Greate country
    When Create a Country
    Then Success mesasage should be displayed

  @Regression
  Scenario: Create a country 2
    When Create a Country name as "Reymond Reddincton95" code as "RR95"
    Then Success mesasage should be displayed