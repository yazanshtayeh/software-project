Feature: search for a book

  Scenario:user Searching for a substring of the title
    Given user entered a substring of a title
    When search book is pressed and the drop down list is on title
    Then search for the book information in the library

  Scenario:user Searching for a substring of the author
    Given user entered a substring of a author
    When search book is pressed and the drop down list is on title
    Then search for the book information in the library

  Scenario:user Searching for a substring of the ISBN
    Given user entered a substring of a ISBN
    When search book is pressed and the drop down list is on title
    Then search for the book information in the library

  Scenario:search failed
    Given user entered information
    When no book matches the information
    Then show a warning massage

  Scenario:search multiple books
    Given user entered information
    When more than one book matches the information
    Then show all books massage