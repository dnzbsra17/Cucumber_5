#Senaryo
#CitizendShip sayfasına gidiniz
#Create işlemini doğrulayınız
#Daha sonra aynı bilgileri tekrar Create yapılamadığını doğrulayınız(negatif test)

Feature: Citizenship with scenario Outline


  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully
    And Navigate to CitizendShip page


  Scenario Outline: CitizenShip  create

    When User a CitizendShip name "<name>" short name is "<short>"
    Then Success mesasage should be displayed

    When User a CitizendShip name "<name>" short name is "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success mesasage should be displayed


    Examples:
      | name  | short |
      | Dulk122 | Dulk122 |
      | Dulk222 | Dulk222 |
      | Dulk322 | Dulk322 |
      | Dulk422 | Dulk422 |




