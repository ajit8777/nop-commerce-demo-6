package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(linkText = "My account")
    WebElement myAccountLink;



    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void getNopCommerceLogo() {
        clickOnElement(nopCommerceLogo);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }



    public void clickOnComputersLink() {
        clickOnElement(computersLink);
    }


    public boolean getLoginLinkText() {
        return verifyThatElementIsDisplayed(loginLink);
    }


}
