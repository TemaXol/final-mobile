package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class MapPage {

    private SelenideElement

            map = $(xpath("//android.widget.FrameLayout[@content-desc='Моя карта']")),
            sale = $(id("ru.vkusvill:id/tv_title"));

    public MapPage selectMap() {
        map.click();
        return this;
    }

    public MapPage checkSale(String value) {
        sale.shouldHave(text(value));
        return this;
    }
}
