Feature: Login Feature

  Scenario Outline: Login with correct input scenario
    Given I am a registered user
    When I try to login with "<username>"
    Then I see the products text

    Examples:
      | username                |
      | standard_user           |
      | locked_out_user         |
      | problem_user            |
      | performance_glitch_user |
      | error_user              |
      | visual_user             |