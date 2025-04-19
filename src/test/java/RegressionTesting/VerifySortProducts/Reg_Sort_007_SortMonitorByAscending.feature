Feature: Sort list of MONITOR by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_007
  Scenario: Sort the list of MONITOR by Ascending Price
    Given Go to the home page
    And Go to the "monitorAndPrinterMenu" menu
    And Select monitor category
    And Select monitor brand name "samsung"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
