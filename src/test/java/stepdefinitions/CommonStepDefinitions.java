package stepdefinitions;

import actions.*;
import basetest.BaseTestCase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CommonStepDefinitions extends BaseTestCase {
    HomePageAction homePageAction;
    SearchAction searchAction;
    HotelListingAction hotelListingAction;
    FlightTimeChangingAction flightTimeChangingAction;
    ProductListAction productListAction;
    ProductDetailsAction productDetailsAction;

    @Before
    public void setUp() {
        super.setUp();
    }

    @BeforeStep
    public void initPageObjects() {
        homePageAction = new HomePageAction(getDriver(), logger);
        searchAction = new SearchAction(getDriver(), logger);
        hotelListingAction = new HotelListingAction(getDriver(), logger);
        flightTimeChangingAction = new FlightTimeChangingAction(getDriver(), logger);
        productListAction = new ProductListAction(getDriver(), logger);
        productDetailsAction = new ProductDetailsAction(getDriver(), logger);
//        homePageAction = new HomePageAction(driver, logger);
//        searchAction = new SearchAction(driver, logger);
//        hotelListingAction = new HotelListingAction(driver, logger);
//        flightTimeChangingAction = new FlightTimeChangingAction(driver, logger);
//        productListAction = new ProductListAction(driver, logger);
//        productDetailsAction = new ProductDetailsAction(driver, logger);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

    // Common step definitions
    @Given("Go to the home page")
    public void goToTheHomePage() {
//        System.out.println("<- TestCaseDebug -> Executed by Thread : " + Thread.currentThread().getId()
//                + " on driver reference : " + getDriver());
        homePageAction.goToHomePage();
    }

    @And("View the product details {string}")
    public void viewProductDetails(String productName) {
        productListAction.viewProductDetails(productName);
    }

    // Phone step definitions
    @When("Enter the phone name {string}")
    public void goToTheHomePage(String phoneName) {
        searchAction.searchTheProductName(phoneName);
    }

    @Then("Ensure that find only one product")
    public void ensureThatFindOnlyOneProduct() {
        String expectedText = "Tìm thấy 1 kết quả";
        compareEqualText(expectedText, searchAction.getTheFoundResultText());
    }

    @And("Validate the product name {string}")
    public void validateProductName(String productName) {
        containText(productName, searchAction.getProductNameText());
    }

    @And("Validate the product price {string}")
    public void validateProductPrice(String productPrice) {
        compareEqualText(productPrice, searchAction.getProductPriceText());
    }
    @And("Go to the {string} menu")
    public void goToTheMenu(String menuName) {
        homePageAction.goToTheMenu(menuName);
    }
    @And("Select the category {string}")
    public void selectTheCategory(String categoryName) {
        productListAction.selectCategory(categoryName);
    }
    @Then("Verify the operation system {string}")
    public void verifyTheOperationSystem(String osName) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(osName));
    }
    @And("Verify the chip model {string}")
    public void verifyTheChipModel(String chipName) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(chipName));
    }
    @And("Verify the speed of CPU {string}")
    public void verifyTheSpeedOfCPU(String cpuSpeed) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(cpuSpeed));
    }

    @And("Verify RAM memory {string}")
    public void verifyRamMemory(String ramTxt) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(ramTxt));
    }
    @And("Verify memory storage {string}")
    public void verifyMemoryStorage(String memoryStorage) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(memoryStorage));
    }

    // Laptop step definitions
    @And("Select the laptop brand name {string}")
    public void selectLatopBrandName(String laptopBrandName) {
        productListAction.selectLaptopBrandName(laptopBrandName);
    }
    @And("View the laptop specification {string}")
    public void viewLatopSpecification(String latopModel) {
        productListAction.viewProductDetails(latopModel);
    }
    @Then("Verify laptop cpu model {string}")
    public void verifyLaptopCpuModel(String cpuModel) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(cpuModel));
    }
    @And("Verify laptop cpu speed {string}")
    public void verifyLaptopCpuSpeed(String cpuSpeed) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(cpuSpeed));
    }
    @And("Verify laptop maximum speed {string}")
    public void verifyLaptopMaxSpeed(String maxSpeed) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(maxSpeed));
    }

    // Smart watch step definitions
    @And("Select smart watch brand name {string}")
    public void selectSmartWatchBrandName(String smartWatchBrandName) {
        productListAction.selectSmartWatchBrandName(smartWatchBrandName);
    }

    @Then("Verify smart watch display {string}")
    public void verifySmartWatchDisplay(String display) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(display));
    }

    @And("Verify smart watch screen size {string}")
    public void verifySmartWatchScreenSize(String screenSize) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(screenSize));
    }

    @And("Verify smart watch resolution {string}")
    public void verifySmartWatchResolution(String resolution) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(resolution));
    }

    @And("Verify smart watch dimension {string}")
    public void verifySmartWatchDimension(String dimension) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(dimension));
    }

    //Tablet step definitions
    @And("Select tablet brand name {string}")
    public void selectTabletBrandName(String tabletBrandName) {
        productListAction.selectTabletBrandName(tabletBrandName);
    }

    @Then("Verify tablet display {string}")
    public void verifyTabletDisplay(String tableDisplay) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(tableDisplay));
    }

    @And("Verify tablet resolution {string}")
    public void verifyTabletResolution(String tabletResolution) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(tabletResolution));
    }

    @And("Verify tablet screen size {string}")
    public void verifyTabletScreenSize(String tabletScreenSize) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(tabletScreenSize));
    }

    //Accessories step definitions
    @And("Select accessory category {string}")
    public void selectAccessoryCategory(String accessoryCategory) {
        productListAction.selectAccessoryCategory(accessoryCategory);
    }

    @And("Select accessory head phone brand name {string}")
    public void selectAccessoryHeadPhoneBrandName(String headPHoneBrandName) {
        productListAction.selectAccessoryHeadPhoneBrandName(headPHoneBrandName);
    }

    @Then("Verify head phone charge port {string}")
    public void verifyChargePort(String chargePort) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(chargePort));
    }

    @And("Verify head phone connection {string}")
    public void verifyHeadPhoneConnection(String connection) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(connection));
    }

    @And("Verify head phone sound technique {string}")
    public void verifyHeadPhoneSoundTecnique(String sound) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(sound));
    }

    @And("Select accessory speaker brand name {string}")
    public void selectAccessorySpeakerBrandName(String speakerBrandName) {
        productListAction.selectAccessorySpeakerBrandName(speakerBrandName);
    }

    @Then("Verify speaker out power {string}")
    public void verifySpeakerOutputPower(String outputPower) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(outputPower));
    }

    @And("Verify speaker sound {string}")
    public void verifySpeakerSound(String speakerSound) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(speakerSound));
    }

    @And("Verify speaker time using {string}")
    public void verifySpeakerTimeUsing(String timeUsing) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(timeUsing));
    }

    @And("Select accessory camera brand name {string}")
    public void selectAccessoryCameraBrandName(String cameraBrandName) {
        productListAction.selectAccessoryCameraBrandName(cameraBrandName);
    }

    @Then("Verify accessory camera resolution {string}")
    public void verifyAccessoryCameraResolution(String cameraResolution) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(cameraResolution));
    }

    @And("Verify accessory camera rotation angle {string}")
    public void verifyAccessoryCameraRotationAngle(String cameraRotationAngle) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(cameraRotationAngle));
    }

    @And("Verify accessory camera vision {string}")
    public void verifyAccessoryCameraVision(String cameraVision) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(cameraVision));
    }

    //Watch step definitions
    @And("Select watch brand name {string}")
    public void selectWatchBrandName(String watchBrandName) {
        productListAction.selectWatchBrandName(watchBrandName);
    }

    @Then("Verify watch strap material {string}")
    public void verifyWatchStrapMaterial(String strapMaterial) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(strapMaterial));
    }

    @And("Verify watch strap width {string}")
    public void verifyWatchStrapWidth(String strapWidth) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(strapWidth));
    }

    @And("Verify watch thickness {string}")
    public void verifyWatchThickness(String watchThickness) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(watchThickness));
    }

    @And("Verify watch glass material {string}")
    public void verifyWatchGlassMaterial(String glassMaterial) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(glassMaterial));
    }

    //Monitor step definitions
    @And("Select monitor category")
    public void selectMonitorCategory() {
        productListAction.selectMonitorCategory();
    }
    @And("Select monitor brand name {string}")
    public void selectMonitorBrandName(String monitorBrandName) {
        productListAction.selectMonitorBrandName(monitorBrandName);
    }
    @Then("Verify monitor resolution {string}")
    public void verifyMonitorResolution(String monitorResolution) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(monitorResolution));
    }
    @And("Verify monitor touchScreen {string}")
    public void verifyMonitorTouchScreen(String monitorTouchScreen) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(monitorTouchScreen));
    }
    @And("Verify monitor response time {string}")
    public void verifyMonitorResponseTime(String monitorResponseTime) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(monitorResponseTime));
    }
    @And("Verify monitor rate technology {string}")
    public void verifyMonitorPanelType(String monitorRateTechnology) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(monitorRateTechnology));
    }

    //Printer step definitions
    @And("Select printer category")
    public void selectPrinterCategory() {
        productListAction.selectPrinterCategory();
    }
    @And("Select printer brand name {string}")
    public void selectPrinterBrandName(String printerBrandName) {
        productListAction.selectPrinterBrandName(printerBrandName);
    }
    @Then("Verify printer function {string}")
    public void verifyPrinterFunction(String printerFunction) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(printerFunction));
    }
    @And("Verify printer quality {string}")
    public void verifyPrinterQuality(String printQuality) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(printQuality));
    }

    @And("Verify printer speed {string}")
    public void verifyPrinterSpeed(String printSpeed) {
        Assert.assertTrue(productDetailsAction.verifySpecificationItem(printSpeed));
    }
}
