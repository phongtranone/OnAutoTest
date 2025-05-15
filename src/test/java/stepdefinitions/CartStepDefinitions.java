package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public CartStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @And("Verify that the cart contains product name {string}")
    public void verifyTheCartContainsProductName(String expectedProductName) {
        Assert.assertTrue(commonStepDefinitions.cartDetailsAction.getProductName().toLowerCase().contains(expectedProductName.toLowerCase()));
    }

    @And("Verify that the cart display original price {string}")
    public void verifyTheCartDisplayOrginalPrice(String expectedOriginalPriceOfProduct) {
        Assert.assertEquals(commonStepDefinitions.cartDetailsAction.getOriginalPriceOfProduct(), expectedOriginalPriceOfProduct);
    }

    @Then("Remove the product in the cart page")
    public void removeTheProductInTheCartPage(){
        commonStepDefinitions.cartDetailsAction.deleteProductInTheCart();
    }

    @Then("Remove all product in the cart page")
    public void removeAllProductInTheCartPage(){
        commonStepDefinitions.cartDetailsAction.removeAllProductInTheCart();
    }

    @And("Verify the cart is empty")
    public void verifyTheCartIsEmpty(){
        Assert.assertTrue(commonStepDefinitions.cartDetailsAction.verifyCartIsEmpty());
    }

    @And("Increase quantity in the cart page with number {string}")
    public void increaseQuantityInTheCartPage(String expectedQuantity){
        commonStepDefinitions.cartDetailsAction.increaseQuantity(expectedQuantity);
    }
    @Then("Verify current quantity after changing with number {string}")
    public void removeTheProductInTheCartPage(String expectedQuantity){
        Assert.assertEquals(commonStepDefinitions.cartDetailsAction.getCurrentQuantity(), expectedQuantity);
    }
}
