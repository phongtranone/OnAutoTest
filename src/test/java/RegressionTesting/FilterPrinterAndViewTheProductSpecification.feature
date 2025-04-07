Feature: Filter PRINTER by the branch
  Can quickly find a PRINTER and view the product specification

  @RegressionTesting @RegressionTestingGroup1
  Scenario Outline: Filter the printer by branch name and view the product specification
    Given Go to the home page
    And Go to the "monitorAndPrinterMenu" menu
    And Select printer category
    And Select printer brand name "brother"
    When View the product details "<printerModel>"
    Then Verify printer function "<function>"
    And Verify printer quality "<printQuality>"
    And Verify printer speed "<printSpeed>"

    Examples:
      |printerModel                             |function          |printQuality   |printSpeed    |
      |Máy in laser trắng đen Brother HL-L2321D |In 2 mặt tự động  |2400 x 600 dpi |30 trang/phút |