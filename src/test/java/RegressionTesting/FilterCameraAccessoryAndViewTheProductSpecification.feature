Feature: Filter CAMERA by the branch
  Can quickly find a CAMERA and view the product specification

  @RegressionTesting @RegressionTestingGroup1 @RegressionTestingGroup4
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
      |cameraModel                    |resolution   |rotationAngle     |vision         |
      |Camera IP 360 Độ 2MP Ezviz C6N |2 MP (1080p) |Xoay ngang 360 độ |10 m trong tối |