Feature: admin logout
Background: admin is logged in
  Scenario: admin logs out
    Given user pressed logout
    When "logout" is pressed
    Then remove admin authorities
    And log out
