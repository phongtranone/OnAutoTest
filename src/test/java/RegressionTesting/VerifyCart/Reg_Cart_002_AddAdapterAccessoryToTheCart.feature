Feature: Add ADAPTER to the cart
  Can quickly add a ADAPTER to the cart and view the cart page

  @RegressionTesting @Reg_Cart_002
  Scenario Outline: Add a adapter to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<adapterModel>"
    And View the product details "<adapterModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<adapterModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |adapterModel                                     |productPrice   |
      |Adapter chuyển đổi Type C 4 in 1 Xmobile DS606H  | 310.000đ      |