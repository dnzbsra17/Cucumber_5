#Senaryo
  #siteye git ->test case -> adım
  # login bilgilerini gir
  # giteye gittiğini doğrula

Feature: Login Functionality
@SmokeTest
  Scenario: Login with valid usurname and password
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully

