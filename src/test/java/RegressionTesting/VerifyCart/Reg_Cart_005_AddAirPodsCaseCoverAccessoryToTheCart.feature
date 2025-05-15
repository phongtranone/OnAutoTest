Feature: Add AIRPODS CASE COVER to the cart
  Can quickly add a AIRPODS CASE COVER to the cart and view the cart page

  @RegressionTesting @Reg_Cart_005
  Scenario Outline: Add a airpods case cover to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<airpodsCaseCoverModel>"
    And View the product details "<airpodsCaseCoverModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<airpodsCaseCoverModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |airpodsCaseCoverModel                                     |productPrice   |
      |Túi đựng AirPods Pro 2 nhựa PC TPU UniQ Clyde Lock Case   | 488.000đ      |