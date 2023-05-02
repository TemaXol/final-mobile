package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class CountryPage {

    private SelenideElement
            selectRussia = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[10]    ")),
            firstTitle = $(id("ru.dodopizza.app:id/title"));


    public CountryPage selectRus() {
        selectRussia.click();
        return this;
    }

    public CountryPage firstTitleCheck(String value) {
        firstTitle.shouldHave(text(value));
        return this;
    }
}
