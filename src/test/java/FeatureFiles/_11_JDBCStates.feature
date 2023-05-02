Feature: Testing JDBS  States
  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully

    Scenario: States testing with JDBC
      And Click on the element in LeftNav
      |setup|
      |paremeters|
      |states|


      Then Send The query the database "select * from States" and control match