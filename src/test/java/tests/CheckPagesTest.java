package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("android")
public class CheckPagesTest extends TestBase {

    RandomData randomData = new RandomData();
    CatalogPage catalogPage = new CatalogPage();
    Advertising advertising = new Advertising();
    MapPage mapPage = new MapPage();
    ProfilePage profilePage = new ProfilePage();
    InputNumberPage inputNumberPage = new InputNumberPage();
    SupportPage supportPage = new SupportPage();

    @Test
    void checkTollBar() {
        step("Select Catalog", () -> {
            advertising.skipAdd();
            catalogPage.selectCatalog();
        });
        step("Select Map Item", () -> {
            mapPage.selectMap();
            mapPage.checkSale(randomData.saleVcus);
        });
        step("Select Profile", () -> {
            profilePage.selectProfile();
            mapPage.checkSale(randomData.saleVcus);
        });
        step("select Support", () -> {
            supportPage.selectSupport();
            supportPage.checkSupport(randomData.support);
        });
    }

    @Test
    void checkInsertNumberPage() {
        step("Select Map Item", () -> {
            advertising.skipAdd();
            mapPage.selectMap();
            mapPage.checkSale(randomData.saleVcus);
        });
        step("Check insert number page", () -> {
            inputNumberPage.inputNumberPage();
            inputNumberPage.checkAgreement(randomData.agreementText);
        });
        step("Check back from the Numbers page", () -> {
            supportPage.clickBackButton();
            mapPage.checkSale(randomData.saleVcus);
        });
    }


    @Test
    void checkSupport() {
        step("Select Support Item", () -> {
            advertising.skipAdd();
            supportPage.selectSupport();
            supportPage.checkSupport(randomData.support);
        });
        step("Check support chat", () -> {
            supportPage.selectSupportChat();
            supportPage.checkSupportTitle(randomData.supportTitle);
        });
        step("Return to support", () -> {
            supportPage.clickBackFromChat();
            supportPage.checkSupport(randomData.support);
        });
    }
}
