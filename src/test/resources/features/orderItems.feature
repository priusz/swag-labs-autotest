Feature: Order Items Feature

  Scenario Outline: Order the items
    Given I am a logged in user as "<username>", using "<browser>"
    When I try to order the items by "<filter>"
    Then I see the ordered products by "<filter>"

    Examples:
      | filter | username      | browser |
      | A - Z  | standard_user | chrome  |
      | Z - A  | standard_user | chrome  |
      | A - Z  | standard_user | firefox |
      | Z - A  | standard_user | firefox |

