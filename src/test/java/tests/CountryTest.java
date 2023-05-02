package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CountryPage;
import pages.LocationPage;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("local")
public class CountryTest extends TestBase {

    CountryPage countryPage = new CountryPage();
    LocationPage locationPage = new LocationPage();
    RandomData randomData = new RandomData();

    @Test
    void successCountrySelect() {
        step("Check correct selecting Country", () -> {
            countryPage.selectRus();
            countryPage.firstTitleCheck(randomData.firstTit);
            locationPage.deliveryCheck(randomData.delivery);
            locationPage.onDinnerCheck(randomData.onDinner);
        });

    }

    @Test
    void successCitySelect() {
        step("Check Country", () -> {
            countryPage.selectRus();
            countryPage.firstTitleCheck(randomData.firstTit);
        });
        step("Check Address", () -> {
            locationPage.selectDeliver();
            locationPage.checkAddress(randomData.address);
            locationPage.selectLocation(randomData.location);
        });
        step("Check correct location", () -> {
            locationPage.clickOnLocation();
            locationPage.checkTown(randomData.town);
        });
    }
}
