package com.codecool.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Util {

    private static final String GRID_URL = "http://localhost:4444/";

    public WebDriver setChromeCapability() throws MalformedURLException, URISyntaxException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "125.0");
        chromeOptions.setCapability("platformName", "linux");
        URL url = new URI(GRID_URL).toURL();
        return new RemoteWebDriver(url, chromeOptions);
    }

    public WebDriver setFirefoxCapability() throws MalformedURLException, URISyntaxException {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("browserVersion", "126.0");
        firefoxOptions.setCapability("platformName", "linux");

        URL url = new URI(GRID_URL).toURL();

        return new RemoteWebDriver(url, firefoxOptions);
    }

}
