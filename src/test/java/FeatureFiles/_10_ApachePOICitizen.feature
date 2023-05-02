Feature: ApachePOI Citizen Functionality
  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully
    And Navigate to CitizendShip page


  Scenario: Create and Delete CitizenShip from Excel
    When User Create citizenship with ApacehPOI
    Then User Delete citizenship with ApacehPOI