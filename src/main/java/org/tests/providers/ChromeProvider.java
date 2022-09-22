package org.tests.providers;

import com.google.inject.Provider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeProvider implements Provider<ChromeDriver> {

    ChromeDriver driver;
    @Override
    public ChromeDriver get() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
