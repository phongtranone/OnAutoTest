Feature: Add a TABLET to the cart
  Can quickly add a TABLET to the cart and view the cart page

  @RegressionTesting @Reg_Cart_009
  Scenario Outline: Add a tablet to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<tabletModel>"
    And View the product details "<tabletModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<tabletModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |tabletModel                        |productPrice   |
      |Lenovo Tab Plus WiFi 8GB/256GB     | 7.490.000đ    |