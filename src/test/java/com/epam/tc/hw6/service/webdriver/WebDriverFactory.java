package com.epam.tc.hw6.service.webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class WebDriverFactory {
    private static final String HUB = "http://192.168.0.16:4444/wd/hub";

    private WebDriverFactory() {
    }

    public static WebDriver createWebDriver(final Browser browser) {
        return null;
    }

    private static Capabilities createChromeCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox");
        return options;
    }

    private static Capabilities createFirefoxCapabilities() {
        return new FirefoxOptions();
    }
}
