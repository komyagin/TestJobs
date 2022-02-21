package com.epam.tc.hw6.service.webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver createWebDriver(final Browser browser) {
        Capabilities capabilities;
        switch (browser) {
            case CHROME:
                capabilities = createChromeCapabilities();
                break;
            case FIREFOX:
                capabilities = createFirefoxCapabilities();
                break;
            default:
                throw new UnsupportedBrowserException();
        }
        return new ChromeDriver(capabilities);
    }

    private static Capabilities createChromeCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        return options;
    }

    private static Capabilities createFirefoxCapabilities() {
        return new FirefoxOptions();
    }
}
