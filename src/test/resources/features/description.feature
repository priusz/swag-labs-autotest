Feature: Description

  Scenario Outline: See the description
    Given I am a logged in user as "<username>"
    When I want to see a description of an "<item>"
    Then I see the selected item's "<description>"

    Examples:
      | username      | item           | description                                                                                                                                                            |
      | standard_user | backpack       | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.                                 |
      | standard_user | bike light     | A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.        |
      | standard_user | black shirt    | Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.                        |
      | standard_user | jacket         | It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office. |
      | standard_user | onesie         | Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.        |
      | standard_user | orange pulover | This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.              |
