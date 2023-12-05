package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    // X-path for Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By hoverOnPantSize = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickOnPantSize = By.xpath("(//div[@class='swatch-option text'])[1]");
    // X-path for Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By pantColour = By.xpath("(//div[@class='swatch-option color'])[1]");

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    By hoverOnAddToCartButton = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickOnAddToCartButton = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    By verifyAddedToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    // Click on ‘shopping cart’ Link into message
    By clickOnShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");



    public void pantSize() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(hoverOnPantSize);
        mouseHoverToElementAndClick(clickOnPantSize);
    }

    public void pantColour() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(pantColour);
    }

    public void addToCart() throws InterruptedException {
//        Thread.sleep(1000);
        mouseHoverToElement(hoverOnAddToCartButton);
        mouseHoverToElementAndClick(clickOnAddToCartButton);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyAddedToShoppingCart);
    }

    public void clickOnShoppingCartInMessage() {
        mouseHoverToElementAndClick(clickOnShoppingCart);
    }

}
