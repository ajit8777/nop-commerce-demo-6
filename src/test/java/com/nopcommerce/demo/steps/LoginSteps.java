package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedText = "Welcome, Please Sign In!";
        String actualText = new LoginPage().getWelcomeMessage();
        Assert.assertEquals(actualText, expectedText,"Login page not display");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualText,expectedText, "No error message displayed");
    }

    @Then("I should see the logOut link is Display")
    public void iShouldSeeTheLogOutLinkIsDisplay() {
        Assert.assertTrue(new LoginPage().getLogoutLinkText(),"Logout link is not displayed");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogoutLink();
    }

    @Then("I should see the login link is Display")
    public void iShouldSeeTheLoginLinkIsDisplay() {
        Assert.assertTrue(new LoginPage().getLoginLinkText(),"Login link is not displayed");
    }
}
