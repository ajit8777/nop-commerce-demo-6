package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on Computer Tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputersLink();
    }

    @Then("I should navigate to Computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
        String expectedText = "Computers";
        String actualText = new ComputerPage().getComputersText();
        Assert.assertEquals(actualText, expectedText, "Not nevigate on Computer page");
    }

    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }
}
