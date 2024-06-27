package com.codecool.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class WebDriverFactory {

    private static final String SELENIUM_GRID_URL = "http://localhost:4444/"; // Updated URL for Selenium Grid 4
    private static final Logger logger = Logger.getLogger(WebDriverFactory.class.getName());

    public static WebDriver createWebDriver(String browser) throws MalformedURLException {
        logger.info("Creating WebDriver for browser: " + browser);
        if ("chrome".equalsIgnoreCase(browser)) {
            ChromeOptions options = new ChromeOptions();
            return new RemoteWebDriver(new URL(SELENIUM_GRID_URL), options);
        } else if ("firefox".equalsIgnoreCase(browser)) {
            FirefoxOptions options = new FirefoxOptions();
            return new RemoteWebDriver(new URL(SELENIUM_GRID_URL), options);
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}
