@liv @tc2 @toRun

Feature: 2. As a user, I should be able to logout from the library app

  Background: User is already on Library login page
    Given User is on Library login "qa3_url" page

  Scenario Outline: Students should have access to 2 modules
    Given User login with credentials "<user name>" and "<password>":
    When User loges out from app
    Then the user on  "login.html"
    Examples: user name and passwords examples:
      | user name           | password |
      | student17@library   | wVIHb1Hu |
      | student18@library   | W8qVceWE |
      | student19@library   | gc3mseeR |
      | librarian13@library | pY8YOLfy |

