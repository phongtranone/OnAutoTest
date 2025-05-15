Feature: Add a WATCH to the cart
  Can quickly add a WATCH to the cart and view the cart page

  @RegressionTesting @Reg_Cart_008
  Scenario Outline: Add a watch to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<watchModel>"
    And View the product details "<watchModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<watchModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |watchModel                                    |productPrice   |
      |ORIENT Contemporary 40 mm Nam RA-TX0301G10B   | 7.057.000đ    |