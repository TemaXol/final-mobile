package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.DriverConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    static DriverConfig config = ConfigFactory.create(DriverConfig.class, System.getProperties());

    @SneakyThrows
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        config = ConfigFactory.create(DriverConfig.class, System.getProperties());

        MutableCapabilities mutableCapabilities = new DesiredCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.user", config.getUser());
        mutableCapabilities.setCapability("browserstack.key", config.getKey());

        mutableCapabilities.setCapability("app", config.getApp());

        mutableCapabilities.setCapability("device", config.getDevice());
        mutableCapabilities.setCapability("os_version", config.getOsVersion());

        mutableCapabilities.setCapability("project", config.getProject());
        mutableCapabilities.setCapability("build", config.getBuild());
        mutableCapabilities.setCapability("name", config.getName());

        try {
            return new RemoteWebDriver(
                    new URL(config.getBaseUrl()), mutableCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
