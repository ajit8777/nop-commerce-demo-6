package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement productNameText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//li/label")
    List<WebElement> HDDRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement HDD400GBRadioButton;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li/label")
    List<WebElement> OSRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    List<WebElement> OSVistaPremiumRadioButton;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li/label")
    List<WebElement> softwareCheckBox;

@CacheLookup
    @FindBy(name = "product_attribute_5_11")
    WebElement softwareAcrobatReaderCheckBox;
@CacheLookup
    @FindBy(name = "product_attribute_5_12")
    WebElement softwareTotalCommanderCheckBox;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement contentMessage;

    public String getProductNameText() {
        return getTextFromElement(productNameText);
    }

    public void selectProcessorFromDropdown(String processor) {
        selectByVisibleTextFromDropDown(processorDropdown, processor);
    }

    public void selectRamFromDropdown(String ram) {
        selectByVisibleTextFromDropDown(ramDropdown, ram);
    }

    public void clickOnRadioButtonOfHDD(String hdd) throws InterruptedException {
        List<WebElement> buttons = HDDRadioButton;
        for (WebElement e : buttons){
            if (e.getText().equals(hdd)){
               e.click();
                break;
            }
        }

    }

    public void clickOnOSRadioButton(String os) {
        List<WebElement> osRadio = OSRadioButton;
        for (WebElement e : osRadio){
            if (e.getText().equals(os)){
                e.click();
            }
        }
    }

    public void clickOnCheckBox(String check) {
       List<WebElement> software = softwareCheckBox;
       for (WebElement e : software){
           if (e.getText().equals(check)){
               e.click();
           }
       }
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getContentMessage() {
        return getTextFromElement(contentMessage);
    }

    public void buildYourOwnComputer(String processor, String ram, String hdd, String os, String software){
        selectProcessorFromDropdown(processor);
        selectRamFromDropdown(ram);
        clickOnOSRadioButton(os);
        clickOnCheckBox(software);

    }

}
