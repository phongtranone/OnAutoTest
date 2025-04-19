Feature: Sort list of WATCH by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_019
  Scenario: Sort the list of WATCH by Ascending Price
    Given Go to the home page
    And Go to the "watchMenu" menu
    And Select watch brand name "orient"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
