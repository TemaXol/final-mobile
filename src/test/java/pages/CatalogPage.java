package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class CatalogPage {

    private SelenideElement

            catalog = $(xpath("//android.widget.FrameLayout[@content-desc='Каталог']"));

    public CatalogPage selectCatalog() {
        catalog.click();
        return this;
    }
}
