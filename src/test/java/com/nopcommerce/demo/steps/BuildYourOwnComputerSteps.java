package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BuildYourOwnComputerSteps {
    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRamFromDropdown(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String hdd) throws InterruptedException {
        new BuildYourOwnComputerPage().clickOnRadioButtonOfHDD(hdd);

    }

    @And("Select OS {string}")
    public void selectOS(String os) {
        new BuildYourOwnComputerPage().clickOnOSRadioButton(os);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().clickOnCheckBox(software);
    }

    @And("Click on ADD TO CART Button")
    public void clickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should see the product added to shopping cart")
    public void iShouldSeeTheProductAddedToShoppingCart() {
        String expectedText = "The product has been added to your shopping cart";
        String actualText = new BuildYourOwnComputerPage().getContentMessage();
        Assert.assertEquals(actualText, expectedText, "Product not added to cart");
    }
}
