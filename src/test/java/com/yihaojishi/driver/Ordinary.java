package com.yihaojishi.driver;

import com.yihaojishi.Configuration;
import com.yihaojishi.page_object.YihaojishiListViewScreen;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * 普通驱动
 */
public class Ordinary {

    protected WebDriver driver;
    protected YihaojishiListViewScreen apiPageObject;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, Configuration.INSTALL_PACKAGES);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Configuration.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, Configuration.NO_RESET);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<MobileElement>(new URL(Configuration.APPIUM_URL), capabilities);
        apiPageObject = new YihaojishiListViewScreen();
        PageFactory.initElements(new AppiumFieldDecorator(driver, Configuration.WAIT_TIME, TimeUnit.SECONDS), apiPageObject);
//        open();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    public MobileElement scrollTo(String text) {
        return (MobileElement) driver.findElement(MobileBy.
                AndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".scrollable(true)).scrollIntoView(resourceId(\"android:id/list\")).scrollIntoView("
                        + "new UiSelector().text(\"" + text + "\"))"));
    }

    void open() {
        if (apiPageObject.cancel_red_packet.isDisplayed()) {
            apiPageObject.cancel_red_packet.click();
        }
    }

    protected void login() {
        apiPageObject.use_password_login.click();
        apiPageObject.login_phone.sendKeys(Configuration.phone);
        apiPageObject.login_password.sendKeys(Configuration.password);
        apiPageObject.login_button.click();
    }

    public void searchAndClick(){
        apiPageObject.search_box.click();
        apiPageObject.search_input.sendKeys(Configuration.SEARCH_ITEM);
        apiPageObject.search_result_click.click();
        scrollTo(Configuration.OPEN_ITEM).click();
    }

    protected void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
