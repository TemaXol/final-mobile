package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class Advertising {

    private SelenideElement

            banner = $(id("ru.dodopizza.app:id/combo_slot_title")),
            add = $(id("ru.vkusvill:id/btn_enter"));

    public Advertising checkBanner(String value) {
        banner.shouldHave(text(value));
        return this;
    }

    public Advertising skipAdd() {
        add.click();
        return this;
    }
}
