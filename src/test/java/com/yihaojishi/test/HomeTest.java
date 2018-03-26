package com.yihaojishi.test;

import com.yihaojishi.driver.Ordinary;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HomeTest extends Ordinary {

    //扫一扫
    @Test
    public void scanTest() {
        assertTrue(apiPageObject.home_scan.isDisplayed());
        apiPageObject.home_scan.click();
        apiPageObject.home_scan.click();
    }

    //消息
    @Test
    public void messageTest(){
        assertTrue(apiPageObject.home_message.isDisplayed());
        apiPageObject.home_message.click();
        apiPageObject.home_message.click();
    }

    //每日签到
    @Test
    public void dailySign(){
        assertTrue(apiPageObject.home_daily_sign.isDisplayed());
        apiPageObject.home_daily_sign.click();
    }

    //限时抢购
    @Test
    public void flashSaleTest() {
        assertTrue(apiPageObject.home_scan.isDisplayed());
        apiPageObject.home_flash_sale.click();
    }

    //特色馆
    @Test
    public void featureTest(){
        assertTrue(apiPageObject.home_feature.isDisplayed());
        apiPageObject.home_feature.click();
    }

    //分类
    @Test
    public void categoryTest(){
        assertTrue(apiPageObject.home_category.isDisplayed());
        apiPageObject.home_category.click();
    }

}
