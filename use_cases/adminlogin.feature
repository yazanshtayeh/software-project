Feature: Admin login

  Scenario:  admin login successfully
    Given loging is pressed
    When the password is correct
    Then give admin authorities

  Scenario:  admin login failed
    Given loging is pressed
    When the password is wrong
    Then dont give admin authorities