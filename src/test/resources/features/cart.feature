Feature: Cart

  Scenario Outline: Check the cart
    Given I am a logged in user as "<username>", using "<browser>"
    When I add to the cart some "<items>"
    Then I see the selected "<items>" in the cart

    Examples:
      | username      | items                   | browser |
      | standard_user | backpack, bike light    | chrome  |
      | standard_user | black shirt, jacket     | chrome  |
      | standard_user | onesie,  orange pulover | chrome  |
      | standard_user | backpack, bike light    | firefox |
      | standard_user | black shirt, jacket     | firefox |
      | standard_user | onesie,  orange pulover | firefox |
