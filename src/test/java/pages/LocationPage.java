package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class LocationPage {

    private SelenideElement
            delivery = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView")),
            onDinner = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView")),
            selectDelivery = $(id("ru.dodopizza.app:id/delivery_button")),
            location = $(id("ru.dodopizza.app:id/delivery_location_address")),
            chooseLocation = $(id("ru.dodopizza.app:id/delivery_location_title")),
            address = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")),
            checkTown = $(id("ru.dodopizza.app:id/food_menu_city_btn"));


    public LocationPage deliveryCheck(String value) {
        delivery.shouldHave(text(value));
        return this;
    }

    public LocationPage onDinnerCheck(String value) {
        onDinner.shouldHave(text(value));
        return this;
    }

    public LocationPage selectDeliver() {
        selectDelivery.click();
        return this;
    }

    public LocationPage selectLocation(String value) {
        location.sendKeys(value);
        return this;
    }

    public LocationPage clickOnLocation() {
        chooseLocation.click();
        return this;
    }

    public LocationPage checkAddress(String value) {
        address.shouldHave(text(value));
        return this;
    }

    public LocationPage checkTown(String value) {
        checkTown.shouldHave(text(value));
        return this;
    }
}
