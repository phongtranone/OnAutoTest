Feature: Filter LAPTOP with Asus brand and memory
  Can quickly filter a LAPTOP LIST

  @RegressionTesting @CombinationFilterLaptop_001
  Scenario Outline: Filter the phone by Asus branch name and memory
    Given Go to the home page
    And Go to the "laptopMenu" menu
    And Go to the Filter function
    When Combination filter laptop with brand name "<brandName>"
    And Combination filter laptop with ram option "<ramMemory>"
    And Combination filter laptop with hard disk option "<hardDiskDrive>"
    And View the filter results
    Then Verify filter result of laptops contain ram memory "<ramMemory>"
    And Verify filter result of laptops contain hard disk "<hardDiskDrive>"

    Examples:
      |brandName   |ramMemory      |hardDiskDrive    |
      |Asus        |RAM 8 GB       |SSD 512 GB       |