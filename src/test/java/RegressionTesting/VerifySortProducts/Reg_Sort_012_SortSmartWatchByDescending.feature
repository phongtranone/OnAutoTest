Feature: Sort list of SMART WATCH by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_012
  Scenario: Sort the list of SMART WATCH by Descending Price
    Given Go to the home page
    And Go to the "smartWatchMenu" menu
    And Select smart watch brand name "huawei"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
