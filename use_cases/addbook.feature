Feature: Add book

  Scenario:  admin added a book
    Given admin is loged in
    When addbook is pressed
    Then add the book information in  the library

  Scenario:guest added a book
    Given user doesn't have authorities
    When addbook is pressed
    Then show a warning massage