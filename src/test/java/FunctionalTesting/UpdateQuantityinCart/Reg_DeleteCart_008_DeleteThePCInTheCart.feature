Feature: Delete a DESKTOP PC in the cart
  Can quickly remove a DESKTOP PC in the cart page

  @RegressionTesting @Reg_Delete_Cart_008
  Scenario Outline: Delete a desktop pc in the cart page
    Given Go to the home page
    When Search a product by the product name "<desktopPCModel>"
    And View the product details "<desktopPCModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |desktopPCModel                  |
      |ROSA Crystal I10 i3 13100       |