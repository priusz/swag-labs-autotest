Feature: Login Feature

  Scenario Outline: Login with correct input scenario
    Given I am a registered user, using "<browser>"
    When I try to login with "<username>"
    Then I see the products text, using "<browser>"

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
  
  Scenario Outline: Login with incorrect input scenario
    Given I am using "<browser>"
    When I try to login with "<username>" and "<password>"
    Then I see the epic sadface error message

    Examples:
      | username | password | browser |
      |          |          | firefox |
      |          |          | chrome  |
      | user     | secret_sauce | firefox |
