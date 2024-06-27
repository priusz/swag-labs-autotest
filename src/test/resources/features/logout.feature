Feature: Logout Feature

  Scenario Outline: Logout
    Given I am a logged in user as "<username>"
    When I try to log out
    Then I see the login button

    Examples:
      | username                |
      | standard_user           |
      | problem_user            |
      | performance_glitch_user |
      | error_user              |
      | visual_user             |