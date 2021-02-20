Feature: 1. As a user, I should be able to login to the library app. verify both Students and librarians  login


Scenario Outline:

  Given the user login as a "<role>"
  Then the user on  "<page>"

Examples:
  | role          |  page        |
  | student       |  #books.      |
  | librarian     | #dashboard    |

