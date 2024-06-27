Feature: Cart

  Scenario Outline: Check the cart
    Given I am a logged in user as "<username>"
    When I add to the cart some "<items>"
    Then I see the selected "<items>" in the cart

    Examples:
      | username      | items                   |
      | standard_user | backpack, bike light    |
      | standard_user | black shirt, jacket     |
      | standard_user | onesie,  orange pulover |
