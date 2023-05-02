package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class Combo {

    private SelenideElement
            selectComboItem = $(xpath("//android.widget.LinearLayout[@content-desc='Комбо']")),
            checkCombo = $(id("ru.dodopizza.app:id/menu_item_product_title")),
            selectCombo = $(id("ru.dodopizza.app:id/menu_item_select_button"));

    public Combo selectComboItem() {
        selectComboItem.click();
        return this;
    }

    public Combo checkCombo(String value) {
        checkCombo.shouldHave(text(value));
        return this;
    }

    public Combo selectCombo() {
        selectCombo.click();
        return this;
    }
}
