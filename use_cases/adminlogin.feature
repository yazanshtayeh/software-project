Feature: Admin login


  Background: user is not logged in

  Scenario:  Administrator logs in with valid credentials
    When user fills id with 222 and password with 222
    Then give admin authorities and go to admin page

 Scenario:  Administrator has the wrong password
    When  user fills id with 11 and password with 11
    And "login" is pressed
    Then  don't give admin authorities
    And  show a wrong info massage