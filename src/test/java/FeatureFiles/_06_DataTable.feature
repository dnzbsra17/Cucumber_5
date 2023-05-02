Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter usurname and password and login button
    Then User should login succesfully

    @Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | paremeters |
      | countries  |

    And Click on the element in Dialog
      | addButton |


    And User sending the keys in Dialog Content
      | nameInput | RonaldaUlk112 |
      | codeInput | RNDULK112     |

    And Click on the element in Dialog
      | saveButton |

    Then Success mesasage should be displayed

    And User delete item from Dialog Content
      | RonaldaUlk112 |

    Then Success mesasage should be displayed

  @Regression
  Scenario: Create Nationality
    And Click on the element in LeftNav
      | setup       |
      | paremeters  |
      | nationality |

    And Click on the element in Dialog
      | addButton |


    And User sending the keys in Dialog Content
      | nameInput | RonaldaUlk1234567891 |

    And Click on the element in Dialog
      | saveButton |

    And User delete item from Dialog Content
      | RonaldaUlk1234567891 |

    Then Success mesasage should be displayed

  Scenario: Fee Fanctionality

    And Click on the element in LeftNav
      | setup      |
      | paremeters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | RonaldaUlk11234 |
      | codeInput       | RNDULK11234     |
      | integrationCode | 1234            |
      | priority        | 123456          |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Success mesasage should be displayed

    And User delete item from Dialog Content

      | RonaldaUlk11234 |
    Then Success mesasage should be displayed


