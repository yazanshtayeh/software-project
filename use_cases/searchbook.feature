Feature: search for a book

  Background: the library has a collection of books with their specs (title-author-isbn-signature)
    Given those books are contained in the library
      |Da Vinci Code-Dan Brown-0307474275-Brown2003|
      |Angels & Demons-Dan Brown-1416524797-Brown2000|
      |The Hobbit-J. R. R. Tolkien-0544174224-Tolkien1937|
      |13 Reasons Why-Jay Asher-0451478290-Asher2007|
      |The Gambler-Fyodor Dostoevsky-1466272325-Dostoevsky1866|
      |Lord of the flies-William Golding-0399501487-Golding1954|
      |The Lord of the Rings-J.R.R. Tolkien-0261103253-Tolkien1954|

 Scenario:Searching for a substring of the title
   When the user search for a book by title "13 Reasons Why"
   Then a list of all books that have the title should be printed on the console

  Scenario:Searching for a substring of the author
    Given the user entered a "substring" for author
    When the user search for a book by author "William Golding"
    Then a list of all books that have the author should be printed on the console

  Scenario:Searching for a substring of the ISBN
    Given the user entered a "substring" for ISBN
    When the user search for a book by ISBN "141"
    Then a list of all books that have the ISBN should be printed on the console

  Scenario:Searching for a substring as a admin
    Given the user entered a "substring" for author
    Given user is logged in
    When the user search for a book by author "William"
    Then a list of all books that have the author should be printed on the console

  Scenario:search failed
    Given the user entered a substring for book
    When the user search for a book by ISBN "1214463"
    Then the searched books should be empty and show a message saying so

  Scenario:Searching for multiple books
    When the user search for a book by title "Lord"
    Then a list of all books that have the title should be printed on the console