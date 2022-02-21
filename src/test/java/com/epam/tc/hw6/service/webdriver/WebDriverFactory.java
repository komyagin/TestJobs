package com.epam.tc.hw6.service.webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver createWebDriver(final Browser browser) {
        return new ChromeDriver();
    }


    private static Capabilities createFirefoxCapabilities() {
        return new FirefoxOptions();
    }
}
