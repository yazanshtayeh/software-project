Feature: Admin login

  Scenario:  Administrator logs in with valid credentials
    Given loging is pressed
    When the password is correct
    Then give admin authorities

  Scenario:  Administrator has the wrong password
    Given loging is pressed
    When the password is wrong
    Then dont give admin authorities