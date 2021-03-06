Feature: Admin login
  Scenario:  admin login successfully
    Given user should enter password
    When the password is correct
    Then give admin authorities
  Scenario:  admin login failed
    Given user should enter password
    When the password is wrong
    Then dont give admin authorities

Feature: admin logout
  Scenario: admin logs out
    Given user pressed logout
    Then remove admin authorities

Feature: Add book
  Scenario:  authorised person added a book
    Given user have authorities
    Then add the book information the the library
  Scenario:not an authorised person added a book
    Given user doesn't have authorities
    Then show a warning massage

Feature: search for a book
  Scenario:user Searching for a substring of the title
    Given user entered a substring of a title
    Then search for the book information the the library
  Scenario:user Searching for a substring of the author
    Given user entered a substring of a author
    Then search for the book information the the library
  Scenario:user Searching for a substring of the ISBN
    Given user entered a substring of a ISBN
    Then search for the book information the the library
  Scenario:search failed
    Given user entered information
    When no book matches the information
    Then show a warning massage
  Scenario:search multiple books
    Given user entered information
    When more than one book matches the information
    Then show all books massage