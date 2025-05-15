Feature: Add a SMART WATCH to the cart
  Can quickly add a SMART WATCH to the cart and view the cart page

  @RegressionTesting @Reg_Cart_007
  Scenario Outline: Add a smart watch to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<smartWatchModel>"
    And View the product details "<smartWatchModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<smartWatchModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |smartWatchModel                               |productPrice   |
      |Huawei Watch GT 5 46mm viền thép dây cao su   | 4.190.000đ    |