Feature: Sort list of LAPTOP by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_005
  Scenario: Sort the list of LAPTOP by Ascending Price
    Given Go to the home page
    And Go to the "laptopMenu" menu
    And Select the laptop brand name "acer"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
