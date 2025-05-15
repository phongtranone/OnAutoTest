Feature: Add WATCH in the cart and make empty cart
  Can quickly remove all WATCH in the cart page

  @FunctionalTesting @FuncCart010
  Scenario Outline: Add watch and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstWatchModel>"
    And View the product details "<firstWatchModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondWatchModel>"
    And View the product details "<secondWatchModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstWatchModel                              |secondWatchModel                      |
      |ORIENT Contemporary 40 mm Nam RA-TX0301G10B  |CITIZEN Tsuyosa 40 mm Nam NJ0150-56W  |