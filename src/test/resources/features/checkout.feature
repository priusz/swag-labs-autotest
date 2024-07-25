Feature: Checkout

  Scenario Outline: Checkout
    Given I am a logged in user as "<username>", using "<browser>"
    When I add to the cart some "<items>" and click on checkout
    Then I can checkout and finish my order with "<firstname>" "<lastname>" "<postalCode>", using "<browser>"

    Examples:
      | username      | items                   | firstname  | lastname  | postalCode |browser |
      | standard_user | backpack, bike light    | testFirst1 | testLast1 | 1111       |chrome  |
      | standard_user | black shirt, jacket     | testFirst2 | testLast2 | 2222       |chrome  |
      | standard_user | onesie,  orange pulover | testFirst3 | testLast3 | 3333       |chrome  |
      | standard_user | backpack, bike light    | testFirst1 | testLast1 | 1111       |firefox  |
      | standard_user | black shirt, jacket     | testFirst2 | testLast2 | 2222       |firefox  |
      | standard_user | onesie,  orange pulover | testFirst3 | testLast3 | 3333       |firefox  |