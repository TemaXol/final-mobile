package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class InputNumberPage {

    private SelenideElement
            inputNumber = $(id("ru.vkusvill:id/btn")),
            agreementText = $(id("ru.vkusvill:id/tv_agreement"));

    public InputNumberPage inputNumberPage() {
        inputNumber.click();
        return this;
    }

    public InputNumberPage checkAgreement(String value) {
        agreementText.shouldHave(text(value));
        return this;
    }
}
