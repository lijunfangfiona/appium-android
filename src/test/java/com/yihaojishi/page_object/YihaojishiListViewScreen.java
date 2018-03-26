package com.yihaojishi.page_object;

import com.yihaojishi.Configuration;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YihaojishiListViewScreen {

    @AndroidFindBy(id = "iv_cancel_red_packet_dialog1")
    public WebElement cancel_red_packet;

    // ------X------ 市集 ------X------ //
    @AndroidFindBy(id = "tab_home")
    public WebElement home;//市集

    // ---*--- 扫一扫 ---*--- //
    @AndroidFindBy(id = "ll_dimcode")
    public WebElement home_scan;//扫一扫

    // ---*--- 消息 ---*--- //
    @AndroidFindBy(id = "ll_message")
    public WebElement home_message;//消息

    // ---*--- 每日签到 ---*--- //
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'每日签到')]")
    public WebElement home_daily_sign;//每日签到

    // ---*--- 限时抢购 ---*--- //
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'限时抢购')]")
    public WebElement home_flash_sale;//限时抢购

    // ---*--- 特色馆 ---*--- //
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'特色馆')]")
    public WebElement home_feature;//特殊馆

    // ---*--- 分类 ---*--- //
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'分类')]")
    public WebElement home_category;//分类

    // ------X------ 分类 ------X------ //
    @AndroidFindBy(id = "tab_category")
    public WebElement category;//分类

    // ---*--- 分类 ---*--- //
    @AndroidFindBy(id = "tv_category_left_title")
    public List<WebElement> category_title_list;//菜单

    // ------X------ 购物车 ------X------ //
    @AndroidFindBy(id = "tab_cart")
    public WebElement cart;//购物车

    // ---*--- 购物车 ---*--- //
    @AndroidFindBy(id = "btn_fragment_cart_unlogin")
    public WebElement cart_login_button;//购物车

    @AndroidFindBy(id = "btn_cart_calculate")
    public WebElement cart_calculate;//结算按钮

    @AndroidFindBy(id = "tv_cart_good_title")
    public List<WebElement> cart_good_titles;//购物车 物品标题

    // ---*--- 搜索 ---*--- //
    @AndroidFindBy(id = "tv_search")
    public WebElement search_box;//搜索框

    @AndroidFindBy(id = "et_search")
    public WebElement search_input;//搜索输入框

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'" + Configuration.SELECT_ITEM + "')]")
    public WebElement search_result_click;

    @AndroidFindBy(id = "tv_search_general_sort")
    public WebElement search_sort_synthesize;//综合排序

    @AndroidFindBy(id = "tv_search_sell_sort")
    public WebElement search_sort_sales;//销量优先

    @AndroidFindBy(id = "ll_search_price_sort")
    public WebElement search_sort_price;//价格排序

    // ---*--- 商品详情 ---*--- //
    @AndroidFindBy(id = "tv_buy_immediately_goods_detail")
    public WebElement good_detail_title;//商品名称

    @AndroidFindBy(id = "tv_current_price_goods_detail")
    public WebElement good_detail_current_price;//当前商品价格

    @AndroidFindBy(id = "tv_market_price_goods_detail")
    public WebElement good_market_current_price;//当前商品原价

    @AndroidFindBy(id = "tv_vip_discount_goods_detail")
    public WebElement good_discount_vip;//打折

    @AndroidFindBy(id = "tv_sold_counts_goods_detail")
    public WebElement good_count_sold;//已售数量

    @AndroidFindBy(id = "tv_shop_address_goods_detail")
    public WebElement good_address;//发货地址

    @AndroidFindBy(id = "rl_goods_params_goods_detail")
    public WebElement good_params;//商品参数

    @AndroidFindBy(id = "wv_goods_detail_new")
    public WebElement good_detail_new;//商品详情

    @AndroidFindBy(id = "tv_buy_immediately_goods_detail")
    public WebElement good_detail_now_buy;//立即购买

    @AndroidFindBy(id = "tv_add_to_cart_goods_detail")
    public WebElement good_detail_add_to_cart;//添加到购物车

    @AndroidFindBy(id = "tv_bottom_dialog_ensure_goods_detail")
    public WebElement good_detail_add_to_cart_button;//添加到购物车确定

    @AndroidFindBy(id = "ll_customer_service_goods_detail")
    public WebElement good_detail_customer_service;//客服

    @AndroidFindBy(id = "ll_storage_goods_detail")
    public WebElement good_detail_storage;//收藏

    // ---*--- 客服 ---*--- //
    @AndroidFindBy(id = "ysf_product_title")
    public WebElement ysf_product_title;//我发送给客服的商品标题

    @AndroidFindBy(id = "nim_message_item_text_body")
    public WebElement nim_message_item_text_body;//客服给我回复的内容

    @AndroidFindBy(id = "editTextMessage")
    public WebElement edit_message;//消息输入框

    @AndroidFindBy(id = "send_message_button")
    public WebElement send_message_button;//发送消息按钮

    // ---*--- 收藏 ---*--- //
    @AndroidFindBy(id = "tv_item_collect_GoodsName")
    public WebElement item_collect_GoodsName;//产品名称

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'" + Configuration.OPEN_ITEM + "')]")
    public WebElement item_collect_name;//收藏的产品名称

    @AndroidFindBy(id = "rl_user_profile_storage")
    public WebElement user_profile_storage;//收藏

    // ------X------ 我的 ------X------ //
    @AndroidFindBy(id = "tab_profile")
    public WebElement profile;//我的

    // ---*--- 登录 ---*--- //
    @AndroidFindBy(id = "tv_base_right")
    public WebElement register;//注册

    @AndroidFindBy(id = "tv_user_login_new_message")
    public WebElement use_message_login;//短信登录

    @AndroidFindBy(id = "tv_user_login_new_password")
    public WebElement use_password_login;//密码登录

    @AndroidFindBy(id = "et_user_login_new_phone")
    public WebElement login_phone;//手机号码

    @AndroidFindBy(id = "et_user_login_new_password")
    public WebElement login_password;//用户密码

    @AndroidFindBy(id = "et_user_login_new_identify_code")
    public WebElement message_code;//验证码

    @AndroidFindBy(id = "tv_user_login_new_get_identify_code")
    public WebElement obtain_message_code;//获取验证码

    @AndroidFindBy(id = "bt_user_fragment_login_new_login")
    public WebElement login_button;//登录按钮

    @AndroidFindBy(id = "tv_user_login_new_forget_password")
    public WebElement forget_password;//忘记密码

    @AndroidFindBy(id = "ll_user_fragment_login_wechat")
    public WebElement login_wechat;//微信登录

    //////////////////// 登录完成 ////////////////////
    @AndroidFindBy(id = "tv_username_profile")
    public WebElement display_username;

}
