Feature: Order Items Feature

  Scenario Outline: Order the items
    Given I am a logged in user as "<username>"
    When I try to order the items by "<filter>"
    Then I see the ordered products

    Examples:
      | filter  | username      |
      | A - Z   | standard_user |
      | Z - A   | standard_user |

