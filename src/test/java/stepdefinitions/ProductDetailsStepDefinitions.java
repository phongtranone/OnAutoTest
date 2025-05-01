package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductDetailsStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public ProductDetailsStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @And("Add the product to the cart")
    public void addToCart() {
        commonStepDefinitions.productDetailsAction.addProductToCart();
    }
    @And("Verify number of product in the cart is {string}")
    public void verifyNumberOfProductInTheCart(String expectedNumberOfProduct) {
        Assert.assertEquals(commonStepDefinitions.productDetailsAction.getNumberOfProductInTheCart(), expectedNumberOfProduct);
    }

    @And("View the cart details")
    public void viewCartDetails() {
        commonStepDefinitions.productDetailsAction.viewCartDetails();
    }
}
