Feature: Add TABLETS in the cart and make empty cart
  Can quickly remove all TABLET in the cart page

  @FunctionalTesting @FuncCart009
  Scenario Outline: Add tablet and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstTabletModel>"
    And View the product details "<firstTabletModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondTabletModel>"
    And View the product details "<secondTabletModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstTabletModel                |secondTabletModel     |
      |iPad Air M3 11 inch WiFi 128GB  |OPPO Pad 3 8GB/256GB  |