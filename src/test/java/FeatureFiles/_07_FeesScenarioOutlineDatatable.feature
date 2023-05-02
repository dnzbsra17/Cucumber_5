#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values Functinality

  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully

  Scenario Outline: Fee Fanctionality
    And Click on the element in LeftNav
      | setup      |
      | paremeters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>        |
      | codeInput       | <code>        |
      | integrationCode | <integration> |
      | priority        | <priority>    |



    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Success mesasage should be displayed

    And User delete item from Dialog Content

      | <name> |
    Then Success mesasage should be displayed

    Examples:
      | name     | code  | integration | priority     |
      | MhmtUlk1 | MHT   | MM1771      | 56564556     |
      | BBSulk1  | BBT   | BKU         | 202578       |
      | UKuL1    | ABBE  | 789         | 78945614     |
      | ZAKul1   | ZAAAA | 15679866    | 267894651256 |
