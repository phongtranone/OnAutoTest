Feature: Change quantity of MOUSE in the cart
  Can quickly update quantity of MOUSE in the cart page

  @FunctionalTesting @FuncUpdateQuantity007
  Scenario Outline: Add mouse and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<mouseModel>"
    And View the product details "<mouseModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |mouseModel                      |updatedQuantity|
      |Chuột Không dây Logitech M170   |5              |