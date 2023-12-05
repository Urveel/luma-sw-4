package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {

  @Test
  public void userShouldAddProductSuccessfullyToShoppingCard() throws InterruptedException {
      Thread.sleep(2000);
      mouseHoverToElement(By.xpath("//span[normalize-space()='Men']"));
      //Mouse Hover on Bottoms
      mouseHoverToElement(By.xpath("//a[@id='ui-id-18']"));
      //Click on Pants
      mouseHoverToElementAndClick(By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"));
      //Mouse Hover on product name Cronus Yoga Pant and click on size 32.
      mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
      //Mouse hover on product name cronus Yoga Pant and click on colour Black.
      mouseHoverToElementAndClick(By.xpath("//div[@class='swatch-option color'])[1]"));
      //Mouse hover on product name Cronus Yoga pant and click on 'Add To Cart' button.
      mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
      mouseHoverToElementAndClick(By.xpath("(//span[contains(text(),'Add to Cart')])[1]"));
      Thread.sleep(2000);
      //Verify the text You added Cronus Yoga Pant to your shopping cart.
      Assert.assertEquals("You added Cronus Yoga Pant to your shopping cart.",getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));
      //Click on 'Shopping cart' Link into message
      clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
      //Verify the text 'Shopping cart'
      Assert.assertEquals("Shopping Cart",getTextFromElement(By.xpath("//span[@class='base']")));
      //Verify the product name 'Cronus Yoga Pant'
      Assert.assertEquals("Cronus Yoga Pant",getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")));
      //Verify the product size '32'
      Assert.assertEquals("32", getTextFromElement(By.xpath("//dd[contains(text(),'32')]")));
      //Verify the product colour 'Black'
      Assert.assertEquals("Black",getTextFromElement(By.xpath("//dd[contains(text(),'Black')]")));
  }
}
