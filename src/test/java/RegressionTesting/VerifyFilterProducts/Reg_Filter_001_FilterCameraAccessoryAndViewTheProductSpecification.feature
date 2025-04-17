Feature: Filter CAMERA by the branch
  Can quickly find a CAMERA and view the product specification

  @RegressionTesting @Reg_Filter_001
  Scenario Outline: Filter the camera by branch name and view the product specification
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "camera"
    And Select accessory camera brand name "ezviz"
    When View the product details "<cameraModel>"
    Then Verify accessory camera resolution "<resolution>"
    And Verify accessory camera rotation angle "<rotationAngle>"
    And Verify accessory camera vision "<vision>"

    Examples:
      |cameraModel                   |resolution   |rotationAngle         |vision         |
      |Camera IP 360 Độ 5MP EZVIZ H6 |5 MP (1620p) |Quét xoay tròn 353 độ |10 m trong tối |