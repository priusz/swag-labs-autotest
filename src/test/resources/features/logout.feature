Feature: Logout Feature

  Scenario Outline: Logout
    Given I am a logged in user as "<username>", using "<browser>"
    When I try to log out
    Then I see the login button, using "<browser>"

    Examples:
      | username                | browser |
      | standard_user           | chrome  |
      | locked_out_user         | chrome  |
      | problem_user            | chrome  |
      | performance_glitch_user | chrome  |
      | error_user              | chrome  |
      | visual_user             | chrome  |
      | standard_user           | firefox |
      | locked_out_user         | firefox |
      | problem_user            | firefox |
      | performance_glitch_user | firefox |
      | error_user              | firefox |
      | visual_user             | firefox |