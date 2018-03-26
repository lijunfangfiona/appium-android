package com.yihaojishi.test;

import com.yihaojishi.driver.Ordinary;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ButtonTest extends Ordinary {

    @Test
    public void homeTabTest() {
        assertTrue(apiPageObject.home.isDisplayed());
    }

    @Test
    public void categoryTabTest() {
        assertTrue(apiPageObject.category.isDisplayed());
    }

    @Test
    public void cartTabTest() {
        assertTrue(apiPageObject.cart.isDisplayed());
    }

    @Test
    public void profileTabTest() {
        assertTrue(apiPageObject.profile.isDisplayed());
    }

}
