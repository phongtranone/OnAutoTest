Feature: Sort list of WATCH by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_020
  Scenario: Sort the list of WATCH by Descending Price
    Given Go to the home page
    And Go to the "watchMenu" menu
    And Select watch brand name "orient"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
