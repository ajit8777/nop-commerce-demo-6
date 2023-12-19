package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsPageSteps {
    @Then("I should navigate to Desktops page successfully")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        String expectedText = "Desktops";
        String actualText = new DesktopsPage().getDesktopsText();
        Assert.assertEquals(actualText, expectedText, "Not Navigate on Desktops page");
    }

    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().ClickOnProductBuildYourOwnComputer();
    }
}
