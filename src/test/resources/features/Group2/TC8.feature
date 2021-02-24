@Safa

Feature:As a user, I should able to see my borrowing books

  Scenario:borrowing books tabe columns names
    Given User is on Library login "qa3_url" page
    And  the user login as a "student"
    When the user click Borrowing Books module
    Then the user shoulde see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?        |

