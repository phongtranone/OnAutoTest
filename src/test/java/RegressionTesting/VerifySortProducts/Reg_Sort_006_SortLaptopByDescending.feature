Feature: Sort list of LAPTOP by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_006
  Scenario: Sort the list of LAPTOP by Descending Price
    Given Go to the home page
    And Go to the "laptopMenu" menu
    And Select the laptop brand name "acer"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
