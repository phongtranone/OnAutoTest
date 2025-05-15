Feature: Delete a MONITOR in the cart
  Can quickly remove a MONITOR in the cart page

  @RegressionTesting @Reg_Delete_Cart_006
  Scenario Outline: Delete a monitor in the cart page
    Given Go to the home page
    When Search a product by the product name "<monitorModel>"
    And View the product details "<monitorModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |monitorModel                      |
      |Asus 23.8 inch Full HD VY249HGR   |