Feature: Admin login


  Background: user is not logged in

  Scenario:  Administrator logs in with valid credentials
    Given the correct password is 222 and correct id is 222
    When user fills id with 222 and password with 222
    Then give admin authorities and go to admin page

 Scenario:  Administrator has the wrong password
    When  user fills id with 11 and password with 11
    Then  don't give admin authorities
    And  show a wrong info massage