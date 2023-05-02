package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Advertising;
import pages.Combo;
import pages.CountryPage;
import pages.LocationPage;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("local")
public class OrderTest extends TestBase {

    RandomData randomData = new RandomData();
    CountryPage countryPage = new CountryPage();
    LocationPage locationPage = new LocationPage();
    Combo combo = new Combo();
    Advertising advertising = new Advertising();

    @Test
    void makeOrder() {

        step("Open App and select location", () -> {
            countryPage.selectRus();
            locationPage.selectDeliver();
            locationPage.selectLocation(randomData.location);
            locationPage.clickOnLocation();
            locationPage.checkTown(randomData.town);
        });
        step("Select Combo menu item", () -> {
            combo.selectComboItem();
            combo.checkCombo(randomData.comboSale);

        });
        step("Open sale Combo", () -> {
            combo.selectCombo();
            advertising.checkBanner(randomData.pizzaBanner);
        });

    }
}
