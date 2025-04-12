Feature: Filter PHONE by the branch
  Can quickly find a PHONE and view the product description

  @FunctionalTesting @FuncFilter001
  Scenario Outline: Filter the phone by branch name and view the product description
    Given Go to the home page
    And Go to the "phoneMenu" menu
    And Select the category "iphone"
    When View the product details "<phoneName>"
    Then Verify the operation system "<operationSystem>"
    And Verify the chip model "<chip>"
    And Verify the speed of CPU "<cpuSpeed>"
    And Verify RAM memory "<ram>"
    And Verify memory storage "<memory>"

    Examples:
      |phoneName               |operationSystem  |chip                 | cpuSpeed  |ram  |memory |
      |iPhone 15 Pro Max 256GB |iOS 17           |Apple A17 Pro 6 nhân | 3.78 GHz  |8 GB |256 GB |