package com.yihaojishi.test;

import com.yihaojishi.driver.Ordinary;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest extends Ordinary {

    //未登录
    @Test
    public void notLoginTest() {
        apiPageObject.cart.click();
        assertTrue(apiPageObject.cart_login_button.isDisplayed());
        assertNotNull(apiPageObject.cart_login_button.getText());
        assertEquals("前去登录", apiPageObject.cart_login_button.getText());
    }

    //去登录
    @Test
    public void goToLoginTest(){
        apiPageObject.cart.click();
        apiPageObject.cart_login_button.click();

    }

}
