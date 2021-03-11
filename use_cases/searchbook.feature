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
   When the user search for a book by title "Lord of the flies"
   Then a list of all books that have the title should be printed on the console

  Scenario:Searching for a substring of the author
    Given the user entered a "substring" for author
    When the user search for a book by author "Dan Brown"
    Then a list of all books that have the author should be printed on the console

  Scenario:Searching for a substring of the ISBN
    Given the user entered a "substring" for ISBN
    When the user search for a book by ISBN "1466272325"
    Then a list of all books that have the ISBN should be printed on the console


 # Scenario: admin Searching for a book
   # Given admin is logged in
   # When "searchbook" is pressed
    #Then search same as normal user


 # Scenario:search failed
  #  Given user searched for a book
   # When no book matches the information
    #Then show a massage

  #Scenario: Found more than one book
   # Given user searched for a book
    #When more than one book matches the information
    #Then show all a list with all books that have the info that was entered