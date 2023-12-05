package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCard() throws InterruptedException {
        Thread.sleep(2000);
        //Mouse Hover on Gear Menu
        mouseHoverToElement(By.xpath("//span[normalize-space()='Gear']"));
        //Click on Bags
        mouseHoverToElementAndClick(By.xpath("//span[normalize-space()='Bags']"));
        //Verify the text 'Overnight Duffle'
        Assert.assertEquals("Overnight Duffle", getTextFromElement(By.xpath("//span[@class='base']")));
        //Change QTY 3
        sendTextToElement(By.xpath("//input[@id='qty']"), "3");
        //Click on 'Add to Cart' button
        clickOnElement(By.xpath("//button[@id='product-addtocart-button']"));
        Thread.sleep(2000);
        //Verify the txt 'You added overnight duffle to your shopping cart,
        Assert.assertEquals("You added Overnight Duffle to your shopping cart,",
                getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));
        //Click on 'Shopping cart' Link into message
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
        //Verify the product name 'Overnight Duffle'
        Assert.assertEquals("Overnight Duffle", getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']")));
        //Verify the product price ‘$135.00’
        Assert.assertEquals("135.00", getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]")));
        //Change Qty to '5'
        clickOnElement(By.xpath("//span[normalize-space()='Update Shopping Cart']"));
        Thread.sleep(1000);
        Assert.assertEquals("$225.00",
                getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]")));
    }
}
