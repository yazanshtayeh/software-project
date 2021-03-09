Feature: Admin login


  Background: user is not logged in

  Scenario:  Administrator logs in with valid credentials
    When the user fills "id" with 222
    And the user fills "password" with 222
    And "login" is pressed
    Then give admin authorities

  Scenario:  Administrator has the wrong password
    When  the user fills "id" with wrong id or filss "password" with wrong password
    Then  don't give admin authorities
    And  show a wrong info massage
