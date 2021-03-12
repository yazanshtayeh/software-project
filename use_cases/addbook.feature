Feature: Add book

  Scenario:  admin added a book
    Given "admin" is logged in
    When "title" and "author" and "signature" is filled
    And  "isbn" is filled and valid
    Then add the book information to the library

  Scenario:guest added a book
    Given admin is not logged in
    When "title" and "author" and "signature" is filled
    And  "isbn" is filled and valid
    Then show warning;
