Feature: Filter LAPTOP with GIGABYTE brand and memory
  Can quickly filter a laptop list

  @RegressionTesting @CombinationFilterLaptop_005
  Scenario Outline: Filter the phone by GIGABYTE branch name and memory
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
      |brandName      |ramMemory      |hardDiskDrive    |
      |GIGABYTE       |RAM 16 GB      |SSD 512 GB       |