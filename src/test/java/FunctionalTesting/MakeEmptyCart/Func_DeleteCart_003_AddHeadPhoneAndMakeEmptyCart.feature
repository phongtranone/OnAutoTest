Feature: Add HEADPHONES and make empty cart
  Can quickly remove all HEADPHONE in the cart page

  @FunctionalTesting @FuncCart003
  Scenario Outline: Add head phone and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstHeadPhoneModel>"
    And View the product details "<firstHeadPhoneModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondHeadPhoneModel>"
    And View the product details "<secondHeadPhoneModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstHeadPhoneModel                |secondHeadPhoneModel          |
      |Tai nghe TWS Xiaomi Redmi Buds 6   |Tai nghe TWS JBL Wave Beam 2  |