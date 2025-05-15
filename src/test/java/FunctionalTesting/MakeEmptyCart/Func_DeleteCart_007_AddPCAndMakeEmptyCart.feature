Feature: Add PC in the cart and make empty cart
  Can quickly remove all PC in the cart page

  @FunctionalTesting @FuncCart007
  Scenario Outline: Add desktop pc and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstPCModel>"
    And View the product details "<firstPCModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondPCModel>"
    And View the product details "<secondPCModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstPCModel                   |secondPCModel               |
      |SingPC i512H682SF-W i5 12450H  |iMac 24 inch M4 24GB/512GB  |