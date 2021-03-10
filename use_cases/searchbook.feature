Feature: search for a book
  Background: user entered a "substring"

  Scenario:Searching for a substring of the title
  Given  the user enterd a "substring" for title
    When the user sareach for a book by title "The Gambler"
    Then a list of all books that have the title should be printed on the console

  Scenario:Searching for a substring of the author
    Given the user enterd a "substring" for author
    When the user sareach for a book by author "Fyodor Dostoevsky"
    Then a list of all books that have the author should be printed on the console

  Scenario:Searching for a substring of the ISBN
    Given the user enterd a "substring" for ISBN
    When the user sareach for a book by ISBN "1466272325"
    Then a list of all books that have the ISBN should be printed on the console


 # Scenario: admin Searching for a book
  #  Given admin is logged in
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