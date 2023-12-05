package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDuffle extends Utility {

    // Verify the text ‘Overnight Duffle’
    By textOvernightDuffle = By.xpath("//span[@class='base']");

    // X-path for Change Qty 3
    By bagQuantity = By.xpath("//input[@id='qty']");
    // X path for 'Add to Cart’ Button.
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By youAdded_ProductTextMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    // Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    // Verify the text ‘Overnight Duffle’
    public String verifyTheTextOvernightDuffle() {
        return getTextFromElement(textOvernightDuffle);
    }
    // Change Qty 3
    public void changeBagQuantity() {
        sendTextToElement(bagQuantity, "3");
    }

    // Click on ‘Add to Cart’ Button.
    public void clickOnAddToCartButton() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public String verifyTextYouAdded_ProductNameMessage() {

        return getTextFromElement(youAdded_ProductTextMessage);
    }
    // Click on Product Name ‘Overnight Duffle’
    public void clickOnShoppingCartInToMessage() {
        clickOnElement(shoppingCart);
    }


}
