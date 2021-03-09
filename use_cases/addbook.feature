Feature: Add book

  Scenario:  admin added a book
    Given "admin" is loged in
    When "title" and "author" and "signature" is filled
    And  "isbn" is filled and valid
    And "addbook" is pressed
    Then add the "book" information to the library

  Scenario:guest added a book
    Given admin is not looged in
    When "title" and "author" and "signature" is filled
    And  "isbn" is filled and valid
    When "addbook" is pressed
