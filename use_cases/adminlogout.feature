Feature: admin logout

  Scenario: admin logs out
    Given admin is logged in
    When "logout" is pressed
    Then remove admin authorities
    And log out
