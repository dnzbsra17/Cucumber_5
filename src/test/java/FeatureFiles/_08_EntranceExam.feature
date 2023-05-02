#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: EntranceExams Functionality

  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully

  Scenario: Exam Form
    And Click on the element in LeftNav
      | exam          |
      | examSetup     |
      | EntranceExams |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | BusKuzUn1234 |
    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in Dialog
      | saveButton |

    And Success mesasage should be displayed

    And Click on the element in LeftNav
      | exam          |
      | examSetup     |
      | EntranceExams |

    And User delete item from Dialog Content
      | BusKuzUn1234 |

    And Success mesasage should be displayed

