Feature: Sort list of MONITOR by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_008
  Scenario: Sort the list of MONITOR by Descending Price
    Given Go to the home page
    And Go to the "monitorAndPrinterMenu" menu
    And Select monitor category
    And Select monitor brand name "samsung"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
