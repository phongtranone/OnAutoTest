Feature: Delete a WATCH in the cart
  Can quickly remove a WATCH in the cart page

  @RegressionTesting @Reg_Delete_Cart_004
  Scenario Outline: Delete a smart watch in the cart page
    Given Go to the home page
    When Search a product by the product name "<watchModel>"
    And View the product details "<watchModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |watchModel                        |
      |CASIO 34 mm Nam MTP-M305D-1AVDF   |