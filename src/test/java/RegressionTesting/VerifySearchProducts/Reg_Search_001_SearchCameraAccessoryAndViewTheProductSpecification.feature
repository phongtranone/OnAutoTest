Feature: Search CAMERA by the camera name
  Can quickly search a CAMERA and view the product specification

  @RegressionTesting @Reg_Search_001
  Scenario Outline: Search the camera by the camera name and view the product specification
    Given Go to the home page
    When Search a product by the product name "<cameraModel>"
    And Ensure that find only one product
    Then View the product details "<cameraModel>"
    And Verify accessory camera resolution "<resolution>"
    And Verify accessory camera rotation angle "<rotationAngle>"
    And Verify accessory camera vision "<vision>"

    Examples:
      |cameraModel                                |resolution   |rotationAngle  |vision         |
      |Camera IP Ngoài Trời 3MP TP-Link Tapo TC65 |3 MP (1296p) |Cố định        |30 m trong tối |