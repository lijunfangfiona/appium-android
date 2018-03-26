package com.yihaojishi.test;

import com.yihaojishi.driver.Ordinary;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class CategoryTest extends Ordinary {

    //分类列表
    @Test
    public void listTest() {
        apiPageObject.category.click();
        assertNotEquals(0, apiPageObject.category_title_list.size());
    }

    //菜单
    @Test
    public void menuClickTest() {
        apiPageObject.category.click();
        assertTrue(scrollTo("进口奶粉").isDisplayed());
        scrollTo("进口奶粉").click();

        assertTrue(scrollTo("尿裤湿巾").isDisplayed());
        scrollTo("尿裤湿巾").click();

        assertTrue(scrollTo("营养保健").isDisplayed());
        scrollTo("营养保健").click();

        assertTrue(scrollTo("个护化妆").isDisplayed());
        scrollTo("个护化妆").click();

        assertTrue(scrollTo("酒水饮料").isDisplayed());
        scrollTo("酒水饮料").click();

        assertTrue(scrollTo("母婴玩具").isDisplayed());
        scrollTo("母婴玩具").click();

        assertTrue(scrollTo("食品生鲜").isDisplayed());
        scrollTo("食品生鲜").click();

        assertTrue(scrollTo("家电生活").isDisplayed());
        scrollTo("家电生活").click();

        assertTrue(scrollTo("首饰箱包").isDisplayed());
        scrollTo("首饰箱包").click();

        assertTrue(scrollTo("奢侈礼品").isDisplayed());
        scrollTo("奢侈礼品").click();

        assertTrue(scrollTo("绿色农业").isDisplayed());
        scrollTo("绿色农业").click();
    }

    @Test
    public void loginTest() {
        apiPageObject.cart.click();
//        apiPageObject.cart_login_button.click();
//        login();
        assertTrue(apiPageObject.cart_calculate.isDisplayed());
    }

    @Test
    public void goodsTest() {
        apiPageObject.cart.click();
//        apiPageObject.cart_login_button.click();
//        login();
        System.out.println("购物车中共 " + apiPageObject.cart_good_titles.size() + " 件商品");
    }

}
