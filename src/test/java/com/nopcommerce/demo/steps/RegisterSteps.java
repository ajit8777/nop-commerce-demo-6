package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on Register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to Register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        String expectedText = "Register";
        String actualText = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText, expectedText, "Not nevigate on register page");
    }

    @And("I click on Register Button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message First name is required.")
    public void iShouldSeeTheErrorMessageFirstNameIsRequired() {
        String expectedText = "First name is required.";
        String actualText = new RegisterPage().getFirstNameErrorText();
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @Then("I should see the error message Last name is required.")
    public void iShouldSeeTheErrorMessageLastNameIsRequired() {
        String expectedText = "Last name is required.";
        String actualText = new RegisterPage().getLastNameErrorText();
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @Then("I should see the error message Email is required.")
    public void iShouldSeeTheErrorMessageEmailIsRequired() {
        String expectedText = "Email is required.";
        String actualText = new RegisterPage().getEmailErrorText();
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @Then("I should see the error message Password is required.")
    public void iShouldSeeTheErrorMessagePasswordIsRequired() {
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().getPasswordErrorText();
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @Then("I should see the error message ConfirmPassword is required.")
    public void iShouldSeeTheErrorMessageConfirmPasswordIsRequired() {
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().getConfirmPasswordErrorText();
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @And("I should select gender Female")
    public void iShouldSelectGenderFemale() {
        new RegisterPage().clickOnFemaleRadioButton();
    }

    @And("I enter First Name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().sendTextToFirstNameField(firstName);
    }

    @And("I enter Last Name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().sendTextToLastNameField(lastName);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String password) {
        new RegisterPage().sendTextToConfirmPasswordField(password);
    }

    @Then("I should Registration completed")
    public void iShouldRegistrationCompleted() {
        String expectedText = "Your registration completed";
        String actualText = new RegisterPage().getRegisterCompletedText();
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectDayFromDropdown(day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonthFromDropdown(month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectYearFromDropdown(year);
    }
}
