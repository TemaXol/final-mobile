package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class ProfilePage {

    private SelenideElement

            profile = $(xpath("//android.widget.FrameLayout[@content-desc='Профиль']"));

    public ProfilePage selectProfile() {
        profile.click();
        return this;
    }
}
