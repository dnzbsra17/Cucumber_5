Feature: DataTable Ornek

  Scenario: Users List
    When Write usurname "Deniz"
    And Write usurname and Password "Deniz" and "1234"
    And Write username as DataTable
    |Deniz|
    |Mehmet|
    |Ayse|
    | Kaya|

    And Write usurname and password DataTable
      |Deniz|1234|
      |Mehmet|2342|
      |Ayse| 4567|
      | Kaya|123995|