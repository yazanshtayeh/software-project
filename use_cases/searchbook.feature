Feature: search for a book
  Background: user entered a "substring"

  Scenario:user Searching for a substring of the title
    Given the "dropdownlist" is on "title"
    When "searchbook" is pressed
    Then search for the book in the library and display it if found

  Scenario:user Searching for a substring of the author
    Given user entered a substring of a author

    When "searchbook" is pressed and the drop down list is on author
    Then search for the book in the library and display it if found

  Scenario:user Searching for a substring of the ISBN
    Given user entered a substring of a ISBN
    When "searchbook" is pressed and the drop down list is on ISBN
    Then search for the book in the library and display it if found


  Scenario: admin Searching for a book
    Given admin is logged in
    When "searchbook" is pressed
    Then search same as normal user


  Scenario: admin Searching for a book
    Given admin is logged in
    When searchbook pressed
    Then search same as normal user

  Scenario:search failed
    Given user searched for a book
    When no book matches the information
    Then show a massage

  Scenario: Found more than one book
    Given user searched for a book
    When more than one book matches the information
    Then show all a list with all books that have the info that was entered