Feature: Sort list of PRINTER by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_009
  Scenario: Sort the list of PRINTER by Descending Price
    Given Go to the home page
    And Go to the "monitorAndPrinterMenu" menu
    And Select printer category
    And Select printer brand name "canon"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
