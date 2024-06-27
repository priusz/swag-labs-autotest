Feature: Login Feature

  Scenario Outline: Login with correct input scenario
    Given I am a registered user
    When I try to login with "<username>" "<password>"
    Then I see the products text

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |