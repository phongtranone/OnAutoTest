Feature: Delete a TABLET in the cart
  Can quickly remove a TABLET in the cart page

  @RegressionTesting @Reg_Delete_Cart_005
  Scenario Outline: Delete a tablet in the cart page
    Given Go to the home page
    When Search a product by the product name "<tabletModel>"
    And View the product details "<tabletModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |tabletModel                      |
      |iPad Pro M4 11 inch WiFi 256GB   |