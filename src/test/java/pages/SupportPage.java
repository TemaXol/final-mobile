package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class SupportPage {

    private SelenideElement
            support = $(xpath("//android.widget.FrameLayout[@content-desc='Поддержка']")),
            supportText = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")),
            backButton = $(xpath("//android.widget.ImageButton[@content-desc='Navigate up']")),
            supportChat = $(id("ru.vkusvill:id/iv_support_write")),
            supportTitle = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")),
            backFromChat = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));

    public SupportPage selectSupport() {
        support.click();
        return this;
    }

    public SupportPage checkSupport(String value) {
        supportText.shouldHave(text(value));
        return this;
    }

    public SupportPage clickBackButton() {
        backButton.click();
        return this;
    }

    public SupportPage selectSupportChat() {
        supportChat.click();
        return this;
    }

    public SupportPage checkSupportTitle(String value) {
        supportTitle.shouldHave(text(value));
        return this;
    }

    public SupportPage clickBackFromChat() {
        backFromChat.click();
        return this;
    }
}
