package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void loginDetails(String email, String password) {
        enterEmailId(email);
        enterPassword(password);
        clickOnLoginButton();
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
    }

    public boolean getLogoutLinkText() {
        return verifyThatElementIsDisplayed(logoutLink);
    }

    public boolean getLoginLinkText() {
        return verifyThatElementIsDisplayed(loginLink);
    }

}
