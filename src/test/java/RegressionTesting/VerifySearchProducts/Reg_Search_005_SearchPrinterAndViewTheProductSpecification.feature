Feature: Search PRINTER by the printer model
  Can quickly search a PRINTER and view the product specification

  @RegressionTesting @Reg_Search_005
  Scenario Outline: Search the printer by the printer model and view the product specification
    Given Go to the home page
    When Search a product by the product name "<printerModel>"
    And Ensure that find only one product
    When View the product details "<printerModel>"
    Then Verify printer function "<function>"
    And Verify printer quality "<printQuality>"
    And Verify printer speed "<printSpeed>"

    Examples:
      |printerModel                           |function  |printQuality   |printSpeed    |
      |Máy in laser trắng đen Canon LBP 6030B |In 1 mặt  |600 x 600 dpi  |18 trang/phút |