Feature: Change quantity of ADAPTER in the cart
  Can quickly update quantity of ADAPTER in the cart page

  @FunctionalTesting @FuncUpdateQuantity003
  Scenario Outline: Add adapter and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<adapterModel>"
    And View the product details "<adapterModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |adapterModel            |updatedQuantity|
      |Anker Zolo 30W A1684    |4              |