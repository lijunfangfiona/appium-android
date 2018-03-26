package com.yihaojishi.test;

import com.yihaojishi.Configuration;
import com.yihaojishi.driver.Special;
import org.junit.Test;

public class AddToCartTest extends Special {

    @Test
    public void toCartTest1() {
        apiPageObject.search_box.click();
        apiPageObject.search_input.sendKeys(Configuration.SEARCH_ITEM);
        apiPageObject.search_result_click.click();
        scrollTo(Configuration.OPEN_ITEM).click();
    }

}
