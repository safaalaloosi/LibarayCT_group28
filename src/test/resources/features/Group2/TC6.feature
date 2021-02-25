@US6
Feature: 6. As a students, I should be able to see tables with default info

  @TC6.1 @Student
  Scenario: Table columns names

    # LOG IN HAPPENS IN HOOKS. Student is logged in by using the @students...
    Then the user should see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |
      | Borrowed By |
