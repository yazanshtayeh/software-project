Feature: admin logout
  Scenario: admin logs out
    Given admin is logged in
    When admin logs out
    Then remove admin authorities
