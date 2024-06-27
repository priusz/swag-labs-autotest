Feature: Checkout

  Scenario Outline: Checkout
    Given I am a logged in user as "<username>"
    When I add to the cart some "<items>"
    Then I can checkout and finish my order with "<firstname>" "<lastname>" "<postalCode>"

    Examples:
      | username      | items                   | firstname  | lastname  | postalCode |
      | standard_user | backpack, bike light    | testFirst1 | testLast1 | 1111       |
      | standard_user | black shirt, jacket     | testFirst2 | testLast2 | 2222       |
      | standard_user | onesie,  orange pulover | testFirst3 | testLast3 | 3333       |