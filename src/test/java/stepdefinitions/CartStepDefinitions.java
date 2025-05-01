package stepdefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;

public class CartStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public CartStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @And("Verify that the cart contains product name {string}")
    public void verifyTheCartContainsProductName(String expectedProductName) {
        Assert.assertEquals(commonStepDefinitions.cartDetailsAction.getProductName(), expectedProductName);
    }

    @And("Verify that the cart display original price {string}")
    public void verifyTheCartDisplayOrginalPrice(String expectedOriginalPriceOfProduct) {
        Assert.assertEquals(commonStepDefinitions.cartDetailsAction.getOriginalPriceOfProduct(), expectedOriginalPriceOfProduct);
    }
}
