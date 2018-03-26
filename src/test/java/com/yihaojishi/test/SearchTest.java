package com.yihaojishi.test;

import com.yihaojishi.Configuration;
import com.yihaojishi.driver.Ordinary;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest extends Ordinary {

    @Test
    public void searchTest1() {
        searchAndClick();
    }

    @Test
    public void searchTest2() {
        apiPageObject.search_box.click();
        assertTrue(apiPageObject.search_input.isDisplayed());

        assertTrue(apiPageObject.search_sort_synthesize.isDisplayed());
        assertNotNull(apiPageObject.search_sort_synthesize.getText());
        apiPageObject.search_sort_synthesize.click();

        assertTrue(apiPageObject.search_sort_sales.isDisplayed());
        assertNotNull(apiPageObject.search_sort_sales.getText());
        apiPageObject.search_sort_sales.click();

        assertTrue(apiPageObject.search_sort_price.isDisplayed());
        assertNotNull(apiPageObject.search_sort_price.getText());
        apiPageObject.search_sort_price.click();
    }

    @Test
    public void searchTest3() {
        apiPageObject.search_box.click();
        apiPageObject.search_input.sendKeys(Configuration.SEARCH_ITEM);
        apiPageObject.search_result_click.click();
    }

    @Test
    public void searchTest4() {
        apiPageObject.search_box.click();
        apiPageObject.search_input.sendKeys(Configuration.SEARCH_ITEM);
        apiPageObject.search_result_click.click();
        scrollTo(Configuration.OPEN_ITEM).click();
    }

    @Test
    public void searchTest5() {
        searchAndClick();

        //商品标题
        assertTrue(apiPageObject.good_detail_title.isDisplayed());
        assertNotNull(apiPageObject.good_detail_title.getText());

        //原价
        assertTrue(apiPageObject.good_detail_current_price.isDisplayed());
        assertNotNull(apiPageObject.good_detail_current_price.getText());

        //现价
        assertTrue(apiPageObject.good_market_current_price.isDisplayed());
        assertNotNull(apiPageObject.good_market_current_price.getText());

        //折扣
        assertTrue(apiPageObject.good_discount_vip.isDisplayed());
        assertNotNull(apiPageObject.good_discount_vip.getText());

        //已售数量
        assertTrue(apiPageObject.good_count_sold.isDisplayed());
        assertNotNull(apiPageObject.good_count_sold.getText());

        //发货地址
        assertTrue(apiPageObject.good_address.isDisplayed());
        assertNotNull(apiPageObject.good_address.getText());

        //商品参数
        assertTrue(apiPageObject.good_params.isDisplayed());
        assertNotNull(apiPageObject.good_params.getText());

        //商品详情
        assertTrue(apiPageObject.good_detail_new.isDisplayed());
        assertNotNull(apiPageObject.good_detail_new.getText());

        //立即购买
        assertTrue(apiPageObject.good_detail_now_buy.isDisplayed());
        assertNotNull(apiPageObject.good_detail_now_buy.getText());

        //添加到购物车
        assertTrue(apiPageObject.good_detail_add_to_cart.isDisplayed());
        assertNotNull(apiPageObject.good_detail_add_to_cart.getText());

        //客服
        assertTrue(apiPageObject.good_detail_customer_service.isDisplayed());
        assertNotNull(apiPageObject.good_detail_customer_service.getText());

        //收藏
        assertTrue(apiPageObject.good_detail_storage.isDisplayed());
        assertNotNull(apiPageObject.good_detail_storage.getText());
    }

    //客服
    @Test
    public void searchTest6() {
        searchAndClick();

        assertTrue(apiPageObject.good_detail_customer_service.isDisplayed());
        apiPageObject.good_detail_customer_service.click();
        login();

        apiPageObject.good_detail_customer_service.click();
        assertTrue(apiPageObject.ysf_product_title.isDisplayed());
        assertNotNull(apiPageObject.ysf_product_title.getText());

        assertTrue(apiPageObject.edit_message.isDisplayed());
        assertNotNull(apiPageObject.edit_message.getText());
        apiPageObject.edit_message.sendKeys("Tester");

        assertTrue(apiPageObject.send_message_button.isDisplayed());
        assertNotNull(apiPageObject.send_message_button.getText());
        apiPageObject.send_message_button.click();

        sleep(10);
    }

    //添加收藏
    @Test
    public void searchTest7() {
        searchAndClick();

        assertTrue(apiPageObject.good_detail_storage.isDisplayed());
        assertNotNull(apiPageObject.good_detail_storage.getText());
        apiPageObject.good_detail_storage.click();
        login();
        apiPageObject.good_detail_storage.click();
    }

    //收藏
    @Test
    public void searchTest8() {
        apiPageObject.profile.click();
        apiPageObject.user_profile_storage.click();
        apiPageObject.user_profile_storage.click();

        assertTrue(apiPageObject.item_collect_name.isDisplayed());
        assertNotNull(apiPageObject.item_collect_name.getText());
        assertEquals(Configuration.OPEN_ITEM, apiPageObject.item_collect_name.getText());
    }

    @Test//加入购物车
    public void toCart1(){
        searchAndClick();

        assertTrue(apiPageObject.good_detail_add_to_cart.isDisplayed());
        assertNotNull(apiPageObject.good_detail_add_to_cart.getText());
        apiPageObject.good_detail_add_to_cart.click();
    }

    @Test//加入购物车
    public void toCart2(){
        searchAndClick();

        assertTrue(apiPageObject.good_detail_add_to_cart.isDisplayed());
        assertNotNull(apiPageObject.good_detail_add_to_cart.getText());
        apiPageObject.good_detail_add_to_cart.click();

        apiPageObject.good_detail_add_to_cart_button.click();
    }

}
