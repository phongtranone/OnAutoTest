Feature: Change quantity of SMART WATCH in the cart
  Can quickly update quantity of SMART WATCH in the cart page

  @FunctionalTesting @FuncUpdateQuantity009
  Scenario Outline: Add smart watch and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<smartWatchModel>"
    And View the product details "<smartWatchModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |smartWatchModel                                     |updatedQuantity|
      |Apple Watch Series 10 42mm viền nhôm dây thể thao   |3              |