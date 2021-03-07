Feature: admin logout

  Scenario: admin logs out
    Given admin is loged in
    When logout is pressed
    Then remove admin authorities