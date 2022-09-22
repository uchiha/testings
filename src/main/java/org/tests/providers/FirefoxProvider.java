package org.tests.providers;

import com.google.inject.Provider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxProvider implements Provider<FirefoxDriver> {
    FirefoxDriver driver;
    @Override
    public FirefoxDriver get() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }
}
